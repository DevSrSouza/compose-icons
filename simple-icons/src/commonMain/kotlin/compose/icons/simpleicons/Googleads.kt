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

public val SimpleIcons.Googleads: ImageVector
    get() {
        if (_googleads != null) {
            return _googleads!!
        }
        _googleads = Builder(name = "Googleads", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.9998f, 22.9291f)
                curveTo(1.7908f, 22.9291f, 0.0f, 21.1383f, 0.0f, 18.9293f)
                reflectiveCurveToRelative(1.7908f, -3.9998f, 3.9998f, -3.9998f)
                reflectiveCurveToRelative(3.9998f, 1.7908f, 3.9998f, 3.9998f)
                reflectiveCurveToRelative(-1.7908f, 3.9998f, -3.9998f, 3.9998f)
                close()
                moveTo(23.4641f, 16.9287f)
                lineTo(15.4632f, 3.072f)
                curveTo(14.3586f, 1.1587f, 11.9121f, 0.5028f, 9.9988f, 1.6074f)
                reflectiveCurveTo(7.4295f, 5.1585f, 8.5341f, 7.0718f)
                lineToRelative(8.0009f, 13.8567f)
                curveToRelative(1.1046f, 1.9133f, 3.5511f, 2.5679f, 5.4644f, 1.4646f)
                curveToRelative(1.9134f, -1.1046f, 2.568f, -3.5511f, 1.4647f, -5.4644f)
                close()
                moveTo(7.5137f, 4.8438f)
                lineTo(1.5645f, 15.1484f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 4.0f, 14.4297f)
                curveToRelative(2.5597f, -0.0075f, 4.6248f, 2.1585f, 4.4941f, 4.7148f)
                lineToRelative(3.2168f, -5.5723f)
                lineToRelative(-3.6094f, -6.25f)
                curveToRelative(-0.4499f, -0.7793f, -0.6322f, -1.6394f, -0.5878f, -2.4784f)
                close()
            }
        }
        .build()
        return _googleads!!
    }

private var _googleads: ImageVector? = null
