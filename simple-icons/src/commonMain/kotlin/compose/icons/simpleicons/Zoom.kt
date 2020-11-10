package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Zoom: VectorAsset
    get() {
        if (_zoom != null) {
            return _zoom!!
        }
        _zoom = VectorAssetBuilder(name = "Zoom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.585f, 13.607f)
                lineToRelative(-0.27f, -0.012f)
                lineTo(1.886f, 13.595f)
                lineToRelative(3.236f, -3.237f)
                lineToRelative(-0.013f, -0.27f)
                arcToRelative(0.815f, 0.815f, 0.0f, false, false, -0.796f, -0.796f)
                lineToRelative(-0.27f, -0.013f)
                lineTo(0.0f, 9.279f)
                lineToRelative(0.014f, 0.27f)
                curveToRelative(0.034f, 0.438f, 0.353f, 0.77f, 0.794f, 0.796f)
                lineToRelative(0.27f, 0.013f)
                horizontalLineToRelative(2.43f)
                lineTo(0.268f, 13.595f)
                lineToRelative(0.014f, 0.269f)
                curveToRelative(0.015f, 0.433f, 0.362f, 0.78f, 0.795f, 0.796f)
                lineToRelative(0.27f, 0.013f)
                horizontalLineToRelative(4.046f)
                lineToRelative(-0.014f, -0.27f)
                curveToRelative(-0.036f, -0.443f, -0.35f, -0.767f, -0.795f, -0.795f)
                close()
                moveTo(7.823f, 9.279f)
                horizontalLineToRelative(-0.004f)
                arcToRelative(2.696f, 2.697f, 0.0f, true, false, 0.003f, 0.0f)
                close()
                moveTo(8.964f, 13.12f)
                arcToRelative(1.619f, 1.619f, 0.0f, true, true, -2.289f, -2.288f)
                arcToRelative(1.619f, 1.619f, 0.0f, false, true, 2.289f, 2.288f)
                close()
                moveTo(21.84f, 9.28f)
                arcToRelative(2.158f, 2.158f, 0.0f, false, false, -1.615f, 0.73f)
                arcToRelative(2.153f, 2.153f, 0.0f, false, false, -1.619f, -0.732f)
                arcToRelative(2.148f, 2.148f, 0.0f, false, false, -1.208f, 0.37f)
                curveToRelative(-0.21f, -0.233f, -0.68f, -0.37f, -0.949f, -0.37f)
                verticalLineToRelative(5.395f)
                lineToRelative(0.27f, -0.013f)
                curveToRelative(0.45f, -0.03f, 0.778f, -0.349f, 0.796f, -0.796f)
                lineToRelative(0.013f, -0.27f)
                verticalLineToRelative(-1.889f)
                lineToRelative(0.014f, -0.27f)
                curveToRelative(0.01f, -0.202f, 0.04f, -0.382f, 0.132f, -0.54f)
                arcToRelative(1.078f, 1.079f, 0.0f, false, true, 1.473f, -0.393f)
                arcToRelative(1.078f, 1.079f, 0.0f, false, true, 0.393f, 0.392f)
                curveToRelative(0.093f, 0.16f, 0.12f, 0.34f, 0.132f, 0.54f)
                lineToRelative(0.014f, 0.271f)
                verticalLineToRelative(1.889f)
                lineToRelative(0.013f, 0.269f)
                arcToRelative(0.83f, 0.83f, 0.0f, false, false, 0.795f, 0.796f)
                lineToRelative(0.27f, 0.013f)
                verticalLineToRelative(-2.967f)
                lineToRelative(0.012f, -0.27f)
                curveToRelative(0.01f, -0.2f, 0.04f, -0.384f, 0.134f, -0.543f)
                curveToRelative(0.3f, -0.514f, 0.96f, -0.69f, 1.473f, -0.39f)
                arcToRelative(1.078f, 1.079f, 0.0f, false, true, 0.393f, 0.393f)
                curveToRelative(0.092f, 0.16f, 0.12f, 0.343f, 0.13f, 0.54f)
                lineToRelative(0.015f, 0.27f)
                verticalLineToRelative(1.889f)
                lineToRelative(0.013f, 0.269f)
                curveToRelative(0.028f, 0.443f, 0.35f, 0.77f, 0.796f, 0.796f)
                lineToRelative(0.27f, 0.013f)
                verticalLineToRelative(-3.237f)
                arcToRelative(2.158f, 2.158f, 0.0f, false, false, -2.16f, -2.156f)
                close()
                moveTo(11.577f, 10.068f)
                arcToRelative(2.697f, 2.698f, 0.0f, true, false, 3.811f, 3.816f)
                arcToRelative(2.697f, 2.698f, 0.0f, false, false, -3.811f, -3.816f)
                close()
                moveTo(14.627f, 13.12f)
                arcToRelative(1.619f, 1.619f, 0.0f, true, true, -2.289f, -2.29f)
                arcToRelative(1.619f, 1.619f, 0.0f, false, true, 2.289f, 2.29f)
                close()
            }
        }
        .build()
        return _zoom!!
    }

private var _zoom: VectorAsset? = null
