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

public val SimpleIcons.Hackerearth: VectorAsset
    get() {
        if (_hackerearth != null) {
            return _hackerearth!!
        }
        _hackerearth = VectorAssetBuilder(name = "Hackerearth", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.983f, 0.002f)
                lineTo(9.508f, 0.002f)
                verticalLineToRelative(6.494f)
                horizontalLineToRelative(0.11f)
                arcToRelative(3.629f, 3.629f, 0.0f, false, true, 3.557f, -1.332f)
                lineToRelative(-0.023f, -0.004f)
                curveToRelative(1.966f, 0.144f, 3.91f, 1.336f, 4.02f, 5.158f)
                verticalLineToRelative(7.554f)
                arcToRelative(0.299f, 0.299f, 0.0f, false, true, -0.287f, 0.287f)
                horizontalLineToRelative(-2.11f)
                arcToRelative(0.287f, 0.287f, 0.0f, false, true, -0.287f, -0.287f)
                lineTo(14.488f, 10.55f)
                curveToRelative(0.0f, -1.778f, -0.585f, -3.114f, -2.341f, -3.114f)
                horizontalLineToRelative(-0.038f)
                arcToRelative(2.606f, 2.606f, 0.0f, false, false, -2.6f, 2.78f)
                verticalLineToRelative(-0.008f)
                verticalLineToRelative(7.665f)
                arcToRelative(0.287f, 0.287f, 0.0f, false, true, -0.287f, 0.287f)
                lineTo(7.124f, 18.16f)
                arcToRelative(0.287f, 0.287f, 0.0f, false, true, -0.287f, -0.287f)
                lineTo(6.837f, 0.004f)
                lineTo(3.193f, 0.004f)
                lineTo(3.126f, 0.003f)
                curveToRelative(-0.823f, 0.0f, -1.493f, 0.652f, -1.523f, 1.468f)
                lineTo(1.603f, 22.458f)
                curveToRelative(0.03f, 0.857f, 0.73f, 1.541f, 1.59f, 1.546f)
                horizontalLineToRelative(17.792f)
                arcToRelative(1.458f, 1.458f, 0.0f, false, false, 1.413f, -1.55f)
                verticalLineToRelative(0.004f)
                lineTo(22.398f, 1.474f)
                arcTo(1.38f, 1.38f, 0.0f, false, false, 21.021f, 0.005f)
                lineToRelative(-0.038f, 0.001f)
                horizontalLineToRelative(0.002f)
                close()
                moveTo(18.443f, 20.985f)
                lineTo(5.555f, 20.985f)
                lineTo(5.555f, 19.66f)
                horizontalLineToRelative(12.888f)
                close()
            }
        }
        .build()
        return _hackerearth!!
    }

private var _hackerearth: VectorAsset? = null
