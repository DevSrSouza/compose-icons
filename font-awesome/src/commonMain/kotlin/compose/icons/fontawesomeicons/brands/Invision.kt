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

public val BrandsGroup.Invision: ImageVector
    get() {
        if (_invision != null) {
            return _invision!!
        }
        _invision = Builder(name = "Invision", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(407.4f, 32.0f)
                horizontalLineTo(40.6f)
                curveTo(18.2f, 32.0f, 0.0f, 50.2f, 0.0f, 72.6f)
                verticalLineToRelative(366.8f)
                curveTo(0.0f, 461.8f, 18.2f, 480.0f, 40.6f, 480.0f)
                horizontalLineToRelative(366.8f)
                curveToRelative(22.4f, 0.0f, 40.6f, -18.2f, 40.6f, -40.6f)
                verticalLineTo(72.6f)
                curveToRelative(0.0f, -22.4f, -18.2f, -40.6f, -40.6f, -40.6f)
                close()
                moveTo(176.1f, 145.6f)
                curveToRelative(0.4f, 23.4f, -22.4f, 27.3f, -26.6f, 27.4f)
                curveToRelative(-14.9f, 0.0f, -27.1f, -12.0f, -27.1f, -27.0f)
                curveToRelative(0.1f, -35.2f, 53.1f, -35.5f, 53.7f, -0.4f)
                close()
                moveTo(332.8f, 377.0f)
                curveToRelative(-65.6f, 0.0f, -34.1f, -74.0f, -25.0f, -106.6f)
                curveToRelative(14.1f, -46.4f, -45.2f, -59.0f, -59.9f, 0.7f)
                lineToRelative(-25.8f, 103.3f)
                horizontalLineTo(177.0f)
                lineToRelative(8.1f, -32.5f)
                curveToRelative(-31.5f, 51.8f, -94.6f, 44.4f, -94.6f, -4.3f)
                curveToRelative(0.1f, -14.3f, 0.9f, -14.0f, 23.0f, -104.1f)
                horizontalLineTo(81.7f)
                lineToRelative(9.7f, -35.6f)
                horizontalLineToRelative(76.4f)
                curveToRelative(-33.6f, 133.7f, -32.6f, 126.9f, -32.9f, 138.2f)
                curveToRelative(0.0f, 20.9f, 40.9f, 13.5f, 57.4f, -23.2f)
                lineToRelative(19.8f, -79.4f)
                horizontalLineToRelative(-32.3f)
                lineToRelative(9.7f, -35.6f)
                horizontalLineToRelative(68.8f)
                lineToRelative(-8.9f, 40.5f)
                curveToRelative(40.5f, -75.5f, 127.9f, -47.8f, 101.8f, 38.0f)
                curveToRelative(-14.2f, 51.1f, -14.6f, 50.7f, -14.9f, 58.8f)
                curveToRelative(0.0f, 15.5f, 17.5f, 22.6f, 31.8f, -16.9f)
                lineTo(386.0f, 325.0f)
                curveToRelative(-10.5f, 36.7f, -29.4f, 52.0f, -53.2f, 52.0f)
                close()
            }
        }
        .build()
        return _invision!!
    }

private var _invision: ImageVector? = null
