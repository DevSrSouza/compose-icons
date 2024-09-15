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

public val SolidGroup.SyncAlt: ImageVector
    get() {
        if (_syncAlt != null) {
            return _syncAlt!!
        }
        _syncAlt = Builder(name = "SyncAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(370.72f, 133.28f)
                curveTo(339.46f, 104.01f, 298.89f, 87.96f, 255.85f, 88.0f)
                curveToRelative(-77.46f, 0.07f, -144.33f, 53.18f, -162.79f, 126.85f)
                curveToRelative(-1.34f, 5.36f, -6.12f, 9.15f, -11.65f, 9.15f)
                horizontalLineTo(24.1f)
                curveToRelative(-7.5f, 0.0f, -13.19f, -6.81f, -11.81f, -14.18f)
                curveTo(33.93f, 94.92f, 134.81f, 8.0f, 256.0f, 8.0f)
                curveToRelative(66.45f, 0.0f, 126.79f, 26.14f, 171.32f, 68.68f)
                lineTo(463.03f, 40.97f)
                curveTo(478.15f, 25.85f, 504.0f, 36.56f, 504.0f, 57.94f)
                verticalLineTo(192.0f)
                curveToRelative(0.0f, 13.26f, -10.74f, 24.0f, -24.0f, 24.0f)
                horizontalLineTo(345.94f)
                curveToRelative(-21.38f, 0.0f, -32.09f, -25.85f, -16.97f, -40.97f)
                lineToRelative(41.75f, -41.75f)
                close()
                moveTo(32.0f, 296.0f)
                horizontalLineToRelative(134.06f)
                curveToRelative(21.38f, 0.0f, 32.09f, 25.85f, 16.97f, 40.97f)
                lineToRelative(-41.75f, 41.75f)
                curveToRelative(31.26f, 29.27f, 71.83f, 45.32f, 114.88f, 45.28f)
                curveToRelative(77.42f, -0.07f, 144.32f, -53.14f, 162.79f, -126.85f)
                curveToRelative(1.34f, -5.36f, 6.12f, -9.15f, 11.65f, -9.15f)
                horizontalLineToRelative(57.3f)
                curveToRelative(7.5f, 0.0f, 13.19f, 6.81f, 11.81f, 14.18f)
                curveTo(478.07f, 417.08f, 377.19f, 504.0f, 256.0f, 504.0f)
                curveToRelative(-66.45f, 0.0f, -126.79f, -26.14f, -171.32f, -68.68f)
                lineTo(48.97f, 471.03f)
                curveTo(33.85f, 486.15f, 8.0f, 475.44f, 8.0f, 454.06f)
                verticalLineTo(320.0f)
                curveToRelative(0.0f, -13.26f, 10.74f, -24.0f, 24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _syncAlt!!
    }

private var _syncAlt: ImageVector? = null
