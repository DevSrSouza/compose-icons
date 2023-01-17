package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.SpringCreators: ImageVector
    get() {
        if (_springCreators != null) {
            return _springCreators!!
        }
        _springCreators = Builder(name = "SpringCreators", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.563f, 24.0f)
                curveToRelative(-1.839f, 0.0f, -4.435f, -0.537f, -7.028f, -2.87f)
                lineToRelative(2.035f, -2.262f)
                curveToRelative(3.636f, 3.273f, 7.425f, 1.98f, 8.595f, 0.888f)
                curveToRelative(0.078f, -0.079f, 0.156f, -0.153f, 0.234f, -0.23f)
                curveToRelative(-3.83f, -0.373f, -6.629f, -3.086f, -6.822f, -3.277f)
                curveToRelative(-2.933f, -2.889f, -3.6f, -6.808f, -1.512f, -8.93f)
                reflectiveCurveToRelative(6.015f, -1.522f, 8.95f, 1.357f)
                curveToRelative(0.257f, 0.246f, 3.116f, 3.052f, 3.677f, 6.605f)
                arcToRelative(6.776f, 6.776f, 0.0f, false, false, 2.727f, -5.426f)
                arcToRelative(6.62f, 6.62f, 0.0f, false, false, -1.995f, -4.791f)
                curveToRelative(-1.334f, -1.303f, -3.222f, -2.02f, -5.306f, -2.02f)
                verticalLineTo(0.0f)
                curveToRelative(2.88f, 0.0f, 5.519f, 1.024f, 7.43f, 2.882f)
                curveToRelative(1.881f, 1.83f, 2.917f, 4.304f, 2.917f, 6.973f)
                arcToRelative(9.831f, 9.831f, 0.0f, false, true, -6.116f, 9.086f)
                curveToRelative(-0.416f, 1.1f, -1.12f, 2.117f, -2.106f, 3.04f)
                curveToRelative(-0.97f, 0.905f, -2.865f, 1.908f, -5.28f, 2.01f)
                curveToRelative(-0.13f, 0.007f, -0.262f, 0.009f, -0.4f, 0.009f)
                close()
                moveTo(7.283f, 9.077f)
                curveToRelative(-0.425f, 0.0f, -0.79f, 0.115f, -1.046f, 0.375f)
                curveToRelative(-0.749f, 0.762f, -0.275f, 2.904f, 1.48f, 4.633f)
                lineToRelative(0.008f, 0.009f)
                curveToRelative(0.025f, 0.024f, 2.771f, 2.687f, 6.025f, 2.414f)
                verticalLineToRelative(-0.005f)
                curveToRelative(0.015f, -2.873f, -2.808f, -5.597f, -2.837f, -5.625f)
                lineToRelative(-0.02f, -0.019f)
                curveTo(9.85f, 9.832f, 8.37f, 9.077f, 7.283f, 9.077f)
                close()
            }
        }
        .build()
        return _springCreators!!
    }

private var _springCreators: ImageVector? = null
