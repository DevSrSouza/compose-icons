package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Disease: ImageVector
    get() {
        if (_disease != null) {
            return _disease!!
        }
        _disease = Builder(name = "Disease", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(472.29f, 195.9f)
                lineToRelative(-67.06f, -23.0f)
                curveToRelative(-19.28f, -6.6f, -33.54f, -20.92f, -38.14f, -38.31f)
                lineToRelative(-16.0f, -60.45f)
                curveToRelative(-11.58f, -43.77f, -76.57f, -57.13f, -110.0f, -22.62f)
                lineTo(195.0f, 99.24f)
                curveToRelative(-13.26f, 13.71f, -33.54f, 20.93f, -54.2f, 19.31f)
                lineToRelative(-71.9f, -5.62f)
                curveToRelative(-52.0f, -4.07f, -86.93f, 44.89f, -59.0f, 82.84f)
                lineToRelative(38.54f, 52.42f)
                curveToRelative(11.08f, 15.07f, 12.82f, 33.86f, 4.64f, 50.24f)
                lineToRelative(-28.43f, 57.0f)
                curveTo(4.0f, 396.67f, 47.46f, 440.29f, 98.11f, 429.23f)
                lineToRelative(70.0f, -15.28f)
                curveToRelative(20.11f, -4.39f, 41.45f, 0.0f, 57.07f, 11.73f)
                lineToRelative(54.32f, 40.83f)
                curveToRelative(39.32f, 29.56f, 101.0f, 7.57f, 104.45f, -37.22f)
                lineToRelative(4.7f, -61.86f)
                curveToRelative(1.35f, -17.8f, 12.8f, -33.87f, 30.63f, -43.0f)
                lineToRelative(62.0f, -31.74f)
                curveToRelative(44.84f, -22.96f, 39.55f, -80.17f, -8.99f, -96.79f)
                close()
                moveTo(160.0f, 256.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f)
                close()
                moveTo(288.0f, 352.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f)
                close()
                moveTo(304.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                close()
            }
        }
        .build()
        return _disease!!
    }

private var _disease: ImageVector? = null
