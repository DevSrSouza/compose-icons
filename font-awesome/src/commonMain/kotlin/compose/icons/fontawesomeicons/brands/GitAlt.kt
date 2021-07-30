package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.GitAlt: ImageVector
    get() {
        if (_gitAlt != null) {
            return _gitAlt!!
        }
        _gitAlt = Builder(name = "GitAlt", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(439.55f, 236.05f)
                lineTo(244.0f, 40.45f)
                arcToRelative(28.87f, 28.87f, 0.0f, false, false, -40.81f, 0.0f)
                lineToRelative(-40.66f, 40.63f)
                lineToRelative(51.52f, 51.52f)
                curveToRelative(27.06f, -9.14f, 52.68f, 16.77f, 43.39f, 43.68f)
                lineToRelative(49.66f, 49.66f)
                curveToRelative(34.23f, -11.8f, 61.18f, 31.0f, 35.47f, 56.69f)
                curveToRelative(-26.49f, 26.49f, -70.21f, -2.87f, -56.0f, -37.34f)
                lineTo(240.22f, 199.0f)
                verticalLineToRelative(121.85f)
                curveToRelative(25.3f, 12.54f, 22.26f, 41.85f, 9.08f, 55.0f)
                arcToRelative(34.34f, 34.34f, 0.0f, false, true, -48.55f, 0.0f)
                curveToRelative(-17.57f, -17.6f, -11.07f, -46.91f, 11.25f, -56.0f)
                verticalLineToRelative(-123.0f)
                curveToRelative(-20.8f, -8.51f, -24.6f, -30.74f, -18.64f, -45.0f)
                lineTo(142.57f, 101.0f)
                lineTo(8.45f, 235.14f)
                arcToRelative(28.86f, 28.86f, 0.0f, false, false, 0.0f, 40.81f)
                lineToRelative(195.61f, 195.6f)
                arcToRelative(28.86f, 28.86f, 0.0f, false, false, 40.8f, 0.0f)
                lineToRelative(194.69f, -194.69f)
                arcToRelative(28.86f, 28.86f, 0.0f, false, false, 0.0f, -40.81f)
                close()
            }
        }
        .build()
        return _gitAlt!!
    }

private var _gitAlt: ImageVector? = null
