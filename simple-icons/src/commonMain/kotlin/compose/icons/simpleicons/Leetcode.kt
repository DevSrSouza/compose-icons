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

public val SimpleIcons.Leetcode: ImageVector
    get() {
        if (_leetcode != null) {
            return _leetcode!!
        }
        _leetcode = Builder(name = "Leetcode", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.483f, 0.0f)
                arcToRelative(1.374f, 1.374f, 0.0f, false, false, -0.961f, 0.438f)
                lineTo(7.116f, 6.226f)
                lineToRelative(-3.854f, 4.126f)
                arcToRelative(5.266f, 5.266f, 0.0f, false, false, -1.209f, 2.104f)
                arcToRelative(5.35f, 5.35f, 0.0f, false, false, -0.125f, 0.513f)
                arcToRelative(5.527f, 5.527f, 0.0f, false, false, 0.062f, 2.362f)
                arcToRelative(5.83f, 5.83f, 0.0f, false, false, 0.349f, 1.017f)
                arcToRelative(5.938f, 5.938f, 0.0f, false, false, 1.271f, 1.818f)
                lineToRelative(4.277f, 4.193f)
                lineToRelative(0.039f, 0.038f)
                curveToRelative(2.248f, 2.165f, 5.852f, 2.133f, 8.063f, -0.074f)
                lineToRelative(2.396f, -2.392f)
                curveToRelative(0.54f, -0.54f, 0.54f, -1.414f, 0.003f, -1.955f)
                arcToRelative(1.378f, 1.378f, 0.0f, false, false, -1.951f, -0.003f)
                lineToRelative(-2.396f, 2.392f)
                arcToRelative(3.021f, 3.021f, 0.0f, false, true, -4.205f, 0.038f)
                lineToRelative(-0.02f, -0.019f)
                lineToRelative(-4.276f, -4.193f)
                curveToRelative(-0.652f, -0.64f, -0.972f, -1.469f, -0.948f, -2.263f)
                arcToRelative(2.68f, 2.68f, 0.0f, false, true, 0.066f, -0.523f)
                arcToRelative(2.545f, 2.545f, 0.0f, false, true, 0.619f, -1.164f)
                lineTo(9.13f, 8.114f)
                curveToRelative(1.058f, -1.134f, 3.204f, -1.27f, 4.43f, -0.278f)
                lineToRelative(3.501f, 2.831f)
                curveToRelative(0.593f, 0.48f, 1.461f, 0.387f, 1.94f, -0.207f)
                arcToRelative(1.384f, 1.384f, 0.0f, false, false, -0.207f, -1.943f)
                lineToRelative(-3.5f, -2.831f)
                curveToRelative(-0.8f, -0.647f, -1.766f, -1.045f, -2.774f, -1.202f)
                lineToRelative(2.015f, -2.158f)
                arcTo(1.384f, 1.384f, 0.0f, false, false, 13.483f, 0.0f)
                close()
                moveTo(10.617f, 12.815f)
                arcToRelative(1.38f, 1.38f, 0.0f, false, false, -1.38f, 1.382f)
                arcToRelative(1.38f, 1.38f, 0.0f, false, false, 1.38f, 1.382f)
                lineTo(20.79f, 15.579f)
                arcToRelative(1.38f, 1.38f, 0.0f, false, false, 1.38f, -1.382f)
                arcToRelative(1.38f, 1.38f, 0.0f, false, false, -1.38f, -1.382f)
                close()
            }
        }
        .build()
        return _leetcode!!
    }

private var _leetcode: ImageVector? = null
