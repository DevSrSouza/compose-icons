package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
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
                curveTo(339.458f, 104.008f, 298.888f, 87.962f, 255.848f, 88.0f)
                curveToRelative(-77.458f, 0.068f, -144.328f, 53.178f, -162.791f, 126.85f)
                curveToRelative(-1.344f, 5.363f, -6.122f, 9.15f, -11.651f, 9.15f)
                horizontalLineTo(24.103f)
                curveToRelative(-7.498f, 0.0f, -13.194f, -6.807f, -11.807f, -14.176f)
                curveTo(33.933f, 94.924f, 134.813f, 8.0f, 256.0f, 8.0f)
                curveToRelative(66.448f, 0.0f, 126.791f, 26.136f, 171.315f, 68.685f)
                lineTo(463.03f, 40.97f)
                curveTo(478.149f, 25.851f, 504.0f, 36.559f, 504.0f, 57.941f)
                verticalLineTo(192.0f)
                curveToRelative(0.0f, 13.255f, -10.745f, 24.0f, -24.0f, 24.0f)
                horizontalLineTo(345.941f)
                curveToRelative(-21.382f, 0.0f, -32.09f, -25.851f, -16.971f, -40.971f)
                lineToRelative(41.75f, -41.749f)
                close()
                moveTo(32.0f, 296.0f)
                horizontalLineToRelative(134.059f)
                curveToRelative(21.382f, 0.0f, 32.09f, 25.851f, 16.971f, 40.971f)
                lineToRelative(-41.75f, 41.75f)
                curveToRelative(31.262f, 29.273f, 71.835f, 45.319f, 114.876f, 45.28f)
                curveToRelative(77.418f, -0.07f, 144.315f, -53.144f, 162.787f, -126.849f)
                curveToRelative(1.344f, -5.363f, 6.122f, -9.15f, 11.651f, -9.15f)
                horizontalLineToRelative(57.304f)
                curveToRelative(7.498f, 0.0f, 13.194f, 6.807f, 11.807f, 14.176f)
                curveTo(478.067f, 417.076f, 377.187f, 504.0f, 256.0f, 504.0f)
                curveToRelative(-66.448f, 0.0f, -126.791f, -26.136f, -171.315f, -68.685f)
                lineTo(48.97f, 471.03f)
                curveTo(33.851f, 486.149f, 8.0f, 475.441f, 8.0f, 454.059f)
                verticalLineTo(320.0f)
                curveToRelative(0.0f, -13.255f, 10.745f, -24.0f, 24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _syncAlt!!
    }

private var _syncAlt: ImageVector? = null
