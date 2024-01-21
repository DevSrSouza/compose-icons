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

public val BrandsGroup.SquareFontAwesomeStroke: ImageVector
    get() {
        if (_squareFontAwesomeStroke != null) {
            return _squareFontAwesomeStroke!!
        }
        _squareFontAwesomeStroke = Builder(name = "SquareFontAwesomeStroke", defaultWidth =
                448.0.dp, defaultHeight = 512.0.dp, viewportWidth = 448.0f, viewportHeight =
                512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.6f, 152.0f)
                curveToRelative(-25.4f, 0.0f, -37.4f, 10.4f, -57.6f, 14.4f)
                verticalLineTo(160.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                reflectiveCurveToRelative(-16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(192.0f)
                curveToRelative(0.0f, 0.8f, 0.1f, 1.6f, 0.2f, 2.4f)
                curveToRelative(0.1f, 0.4f, 0.1f, 0.8f, 0.2f, 1.2f)
                curveToRelative(1.6f, 7.1f, 8.0f, 12.4f, 15.6f, 12.4f)
                reflectiveCurveToRelative(14.0f, -5.3f, 15.6f, -12.4f)
                curveToRelative(0.1f, -0.4f, 0.2f, -0.8f, 0.2f, -1.2f)
                curveToRelative(0.1f, -0.8f, 0.2f, -1.6f, 0.2f, -2.4f)
                verticalLineTo(198.4f)
                curveToRelative(4.0f, -0.8f, 7.7f, -1.8f, 11.2f, -3.0f)
                curveToRelative(14.3f, -4.7f, 26.0f, -11.4f, 46.4f, -11.4f)
                curveToRelative(31.4f, 0.0f, 43.2f, 16.0f, 74.6f, 16.0f)
                curveToRelative(8.9f, 0.0f, 15.9f, -1.1f, 24.2f, -3.5f)
                curveToRelative(1.2f, -0.3f, 2.4f, -0.7f, 3.6f, -1.1f)
                verticalLineToRelative(96.0f)
                curveToRelative(-10.0f, 3.2f, -17.6f, 4.6f, -27.8f, 4.6f)
                curveToRelative(-31.4f, 0.0f, -43.4f, -16.0f, -74.6f, -16.0f)
                curveToRelative(-10.2f, 0.0f, -18.2f, 1.8f, -25.6f, 4.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(7.4f, -2.4f, 15.4f, -4.0f, 25.6f, -4.0f)
                curveToRelative(31.4f, 0.0f, 43.2f, 16.0f, 74.6f, 16.0f)
                curveToRelative(18.6f, 0.0f, 28.2f, -4.8f, 59.8f, -16.0f)
                verticalLineTo(152.0f)
                curveToRelative(-31.6f, 11.2f, -41.2f, 16.0f, -59.8f, 16.0f)
                curveTo(244.8f, 168.0f, 232.8f, 152.0f, 201.6f, 152.0f)
                close()
                moveTo(384.0f, 32.0f)
                horizontalLineTo(64.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                verticalLineToRelative(320.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                horizontalLineToRelative(320.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                verticalLineTo(96.0f)
                curveTo(448.0f, 60.7f, 419.3f, 32.0f, 384.0f, 32.0f)
                close()
                moveTo(416.0f, 416.0f)
                curveToRelative(0.0f, 17.6f, -14.4f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(64.0f)
                curveToRelative(-17.6f, 0.0f, -32.0f, -14.4f, -32.0f, -32.0f)
                verticalLineTo(96.0f)
                curveToRelative(0.0f, -17.6f, 14.4f, -32.0f, 32.0f, -32.0f)
                horizontalLineToRelative(320.0f)
                curveToRelative(17.6f, 0.0f, 32.0f, 14.4f, 32.0f, 32.0f)
                verticalLineTo(416.0f)
                close()
            }
        }
        .build()
        return _squareFontAwesomeStroke!!
    }

private var _squareFontAwesomeStroke: ImageVector? = null
