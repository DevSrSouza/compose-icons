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

public val SimpleIcons.Showpad: ImageVector
    get() {
        if (_showpad != null) {
            return _showpad!!
        }
        _showpad = Builder(name = "Showpad", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 11.9872f)
                curveToRelative(0.0f, -0.0894f, 0.0f, -0.1787f, -0.0128f, -0.2808f)
                verticalLineToRelative(-0.0383f)
                curveToRelative(0.0f, -0.0766f, -0.0127f, -0.1532f, -0.0127f, -0.2426f)
                verticalLineToRelative(-0.0128f)
                curveToRelative(-0.2681f, -2.5787f, -2.3107f, -4.6085f, -4.8766f, -4.8766f)
                horizontalLineToRelative(-0.0128f)
                curveToRelative(-0.0766f, -0.0128f, -0.1532f, -0.0128f, -0.2426f, -0.0128f)
                horizontalLineToRelative(-0.0383f)
                curveToRelative(-0.0893f, 0.0f, -0.1787f, -0.0128f, -0.2808f, -0.0128f)
                curveToRelative(-1.4553f, 0.0f, -2.8468f, 0.5745f, -3.868f, 1.6086f)
                lineToRelative(-1.864f, 1.851f)
                lineToRelative(1.3533f, 1.3532f)
                lineToRelative(1.3404f, -1.3532f)
                horizontalLineToRelative(-0.0128f)
                lineToRelative(0.5107f, -0.5105f)
                curveToRelative(0.6638f, -0.6766f, 1.583f, -1.0468f, 2.5276f, -1.0468f)
                horizontalLineToRelative(0.2043f)
                curveToRelative(0.051f, 0.0f, 0.1021f, 0.0f, 0.1532f, 0.0128f)
                horizontalLineToRelative(0.0128f)
                curveToRelative(1.685f, 0.1787f, 3.0127f, 1.5063f, 3.1787f, 3.1787f)
                verticalLineToRelative(0.0128f)
                curveToRelative(0.0f, 0.051f, 0.0128f, 0.1021f, 0.0128f, 0.1532f)
                verticalLineToRelative(0.4084f)
                curveToRelative(0.0f, 0.0511f, -0.0128f, 0.1022f, -0.0128f, 0.1532f)
                curveToRelative(-0.1277f, 1.2255f, -0.8809f, 2.2979f, -1.9787f, 2.834f)
                lineToRelative(-0.0383f, 0.0129f)
                arcToRelative(0.3813f, 0.3813f, 0.0f, false, false, -0.1022f, 0.051f)
                lineToRelative(-0.0766f, 0.0256f)
                lineToRelative(-0.0638f, 0.0255f)
                lineToRelative(-0.1149f, 0.0383f)
                lineToRelative(-0.0255f, 0.0128f)
                curveToRelative(-1.2894f, 0.4468f, -2.7192f, 0.1148f, -3.6894f, -0.8554f)
                lineToRelative(-0.4979f, -0.4979f)
                lineToRelative(-3.3702f, -3.3574f)
                lineToRelative(-5.3617f, -5.3617f)
                lineToRelative(-1.3532f, 1.3532f)
                lineTo(0.0f, 12.0f)
                lineToRelative(1.3532f, 1.3532f)
                lineToRelative(5.3872f, 5.3872f)
                lineToRelative(1.3532f, -1.3532f)
                lineToRelative(3.3702f, -3.3702f)
                lineToRelative(-1.3532f, -1.3532f)
                lineToRelative(-3.3702f, 3.3702f)
                lineTo(2.6936f, 12.0f)
                lineToRelative(4.0468f, -4.0468f)
                lineToRelative(2.017f, 2.0298f)
                lineToRelative(5.3873f, 5.3872f)
                lineToRelative(0.4979f, 0.4979f)
                curveToRelative(1.0212f, 1.034f, 2.4255f, 1.6085f, 3.8808f, 1.5957f)
                curveToRelative(0.6128f, 0.0f, 1.2128f, -0.102f, 1.7872f, -0.2936f)
                lineToRelative(0.0511f, -0.0128f)
                curveToRelative(0.051f, -0.0255f, 0.1149f, -0.0383f, 0.166f, -0.0638f)
                lineToRelative(0.102f, -0.0383f)
                lineToRelative(0.1022f, -0.051f)
                lineToRelative(0.1532f, -0.0767f)
                lineToRelative(0.051f, -0.0255f)
                curveToRelative(1.698f, -0.8298f, 2.8469f, -2.4766f, 3.0511f, -4.3532f)
                curveToRelative(0.0128f, -0.0766f, 0.0128f, -0.166f, 0.0128f, -0.2425f)
                verticalLineToRelative(-0.3192f)
                close()
            }
        }
        .build()
        return _showpad!!
    }

private var _showpad: ImageVector? = null
