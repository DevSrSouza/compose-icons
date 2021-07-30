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

public val SimpleIcons.Autohotkey: ImageVector
    get() {
        if (_autohotkey != null) {
            return _autohotkey!!
        }
        _autohotkey = Builder(name = "Autohotkey", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.514f, 0.508f)
                lineTo(20.514f, 0.51f)
                lineTo(1.803f, 0.51f)
                curveTo(1.053f, 0.51f, 0.079f, 1.135f, 0.0f, 2.27f)
                verticalLineToRelative(17.133f)
                horizontalLineToRelative(0.002f)
                verticalLineToRelative(2.325f)
                curveToRelative(0.08f, 1.136f, 1.05f, 1.763f, 1.8f, 1.763f)
                horizontalLineToRelative(1.505f)
                lineToRelative(0.002f, -0.002f)
                horizontalLineToRelative(18.869f)
                curveToRelative(1.256f, -0.053f, 1.766f, -1.066f, 1.822f, -1.699f)
                verticalLineToRelative(-3.023f)
                horizontalLineToRelative(-0.002f)
                lineTo(23.998f, 2.209f)
                curveToRelative(-0.056f, -0.633f, -0.567f, -1.648f, -1.824f, -1.701f)
                horizontalLineToRelative(-1.66f)
                close()
                moveTo(3.412f, 1.623f)
                horizontalLineToRelative(17.154f)
                curveToRelative(0.898f, 0.0f, 1.618f, 0.72f, 1.618f, 1.617f)
                verticalLineToRelative(16.64f)
                curveToRelative(0.0f, 0.898f, -0.72f, 1.62f, -1.618f, 1.62f)
                lineTo(3.412f, 21.5f)
                arcToRelative(1.616f, 1.616f, 0.0f, false, true, -1.619f, -1.62f)
                lineTo(1.793f, 3.24f)
                curveToRelative(0.0f, -0.897f, 0.722f, -1.617f, 1.62f, -1.617f)
                close()
                moveTo(6.727f, 14.035f)
                lineToRelative(-1.895f, 5.037f)
                horizontalLineToRelative(0.703f)
                lineToRelative(0.526f, -1.467f)
                horizontalLineToRelative(2.02f)
                lineToRelative(0.497f, 1.467f)
                horizontalLineToRelative(0.744f)
                lineToRelative(-1.824f, -5.037f)
                horizontalLineToRelative(-0.771f)
                close()
                moveTo(15.157f, 14.043f)
                verticalLineToRelative(5.037f)
                horizontalLineToRelative(0.679f)
                verticalLineToRelative(-1.767f)
                lineToRelative(0.793f, -0.758f)
                lineToRelative(1.76f, 2.525f)
                horizontalLineToRelative(0.884f)
                lineToRelative(-2.154f, -3.002f)
                lineToRelative(2.098f, -2.035f)
                horizontalLineToRelative(-0.94f)
                lineToRelative(-2.441f, 2.441f)
                verticalLineToRelative(-2.441f)
                horizontalLineToRelative(-0.68f)
                close()
                moveTo(10.004f, 14.07f)
                verticalLineToRelative(5.037f)
                horizontalLineToRelative(0.682f)
                verticalLineToRelative(-2.351f)
                horizontalLineToRelative(2.628f)
                verticalLineToRelative(2.351f)
                horizontalLineToRelative(0.682f)
                lineTo(13.996f, 14.07f)
                horizontalLineToRelative(-0.682f)
                verticalLineToRelative(2.084f)
                horizontalLineToRelative(-2.628f)
                lineTo(10.686f, 14.07f)
                horizontalLineToRelative(-0.682f)
                close()
                moveTo(7.078f, 14.787f)
                horizontalLineToRelative(0.014f)
                lineToRelative(0.742f, 2.217f)
                lineTo(6.271f, 17.004f)
                lineToRelative(0.807f, -2.217f)
                close()
            }
        }
        .build()
        return _autohotkey!!
    }

private var _autohotkey: ImageVector? = null
