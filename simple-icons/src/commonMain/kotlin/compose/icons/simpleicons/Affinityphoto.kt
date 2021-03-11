package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Affinityphoto: ImageVector
    get() {
        if (_affinityphoto != null) {
            return _affinityphoto!!
        }
        _affinityphoto = Builder(name = "Affinityphoto", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.44f, 0.0f)
                lineToRelative(-0.48f, 0.831f)
                lineToRelative(5.88f, 10.185f)
                lineTo(22.2f, 0.0f)
                close()
                moveTo(23.28f, 0.0f)
                lineToRelative(-8.577f, 14.856f)
                lineTo(24.0f, 14.856f)
                lineTo(24.0f, 0.711f)
                arcTo(0.72f, 0.72f, 0.0f, false, false, 23.28f, 0.0f)
                close()
                moveTo(9.42f, 1.767f)
                lineTo(5.76f, 8.106f)
                horizontalLineToRelative(7.32f)
                close()
                moveTo(10.983f, 9.024f)
                horizontalLineToRelative(-0.018f)
                curveToRelative(-0.36f, 0.005f, -0.7f, 0.216f, -0.879f, 0.523f)
                lineToRelative(-1.083f, 1.88f)
                lineToRelative(-0.008f, 0.014f)
                arcToRelative(1.052f, 1.052f, 0.0f, false, false, 0.0f, 1.02f)
                arcToRelative(16710.389f, 16710.389f, 0.0f, false, false, 1.093f, 1.894f)
                curveToRelative(0.184f, 0.31f, 0.53f, 0.5f, 0.885f, 0.501f)
                curveToRelative(0.002f, 0.0f, 1.38f, 0.002f, 2.067f, -0.001f)
                curveToRelative(0.36f, -0.005f, 0.699f, -0.205f, 0.878f, -0.512f)
                curveToRelative(0.364f, -0.631f, 0.731f, -1.261f, 1.093f, -1.894f)
                curveToRelative(0.176f, -0.314f, 0.17f, -0.703f, -0.007f, -1.011f)
                lineToRelative(-0.01f, -0.015f)
                lineToRelative(-1.078f, -1.87f)
                lineToRelative(-0.006f, -0.009f)
                arcToRelative(1.053f, 1.053f, 0.0f, false, false, -0.879f, -0.52f)
                horizontalLineToRelative(-0.012f)
                close()
                moveTo(5.22f, 9.04f)
                lineTo(0.0f, 18.082f)
                verticalLineToRelative(0.39f)
                lineToRelative(0.003f, 4.871f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, false, 0.662f, 0.655f)
                lineTo(9.3f, 9.04f)
                close()
                moveTo(8.16f, 12.885f)
                lineTo(1.736f, 24.0f)
                horizontalLineToRelative(12.84f)
                close()
                moveTo(10.917f, 15.791f)
                lineTo(15.657f, 24.0f)
                horizontalLineToRelative(7.623f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, false, 0.72f, -0.72f)
                verticalLineToRelative(-7.488f)
                close()
            }
        }
        .build()
        return _affinityphoto!!
    }

private var _affinityphoto: ImageVector? = null
