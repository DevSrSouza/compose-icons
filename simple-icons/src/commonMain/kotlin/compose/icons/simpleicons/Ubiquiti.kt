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

public val SimpleIcons.Ubiquiti: VectorAsset
    get() {
        if (_ubiquiti != null) {
            return _ubiquiti!!
        }
        _ubiquiti = VectorAssetBuilder(name = "Ubiquiti", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.331f, 3.987f)
                lineTo(4.012f, 3.987f)
                verticalLineToRelative(-1.32f)
                horizontalLineToRelative(1.32f)
                close()
                moveTo(12.936f, 19.988f)
                curveToRelative(-1.78f, -0.08f, -3.15f, -0.532f, -4.21f, -1.185f)
                curveToRelative(0.718f, 3.118f, 3.405f, 4.65f, 3.535f, 4.723f)
                lineToRelative(0.792f, 0.437f)
                curveToRelative(6.063f, -0.405f, 9.611f, -4.318f, 9.611f, -9.436f)
                verticalLineToRelative(-1.109f)
                curveToRelative(-1.441f, 4.7f, -4.795f, 6.793f, -9.728f, 6.57f)
                moveTo(4.006f, 9.605f)
                horizontalLineToRelative(1.332f)
                verticalLineToRelative(2.94f)
                horizontalLineToRelative(1.336f)
                lineTo(6.674f, 7.627f)
                lineTo(8.01f, 7.627f)
                verticalLineToRelative(9.612f)
                curveTo(8.009f, 21.8f, 12.0f, 24.0f, 12.0f, 24.0f)
                curveToRelative(-6.705f, 0.0f, -10.664f, -4.065f, -10.664f, -9.473f)
                lineTo(1.336f, 3.65f)
                lineTo(2.67f, 3.65f)
                verticalLineToRelative(7.274f)
                horizontalLineToRelative(1.336f)
                close()
                moveTo(2.67f, 1.334f)
                lineTo(1.336f, 1.334f)
                lineTo(1.336f, 0.0f)
                lineTo(2.67f, 0.0f)
                close()
                moveTo(5.331f, 8.287f)
                horizontalLineToRelative(-1.32f)
                verticalLineToRelative(-1.32f)
                horizontalLineToRelative(1.32f)
                close()
                moveTo(6.665f, 6.307f)
                horizontalLineToRelative(-1.32f)
                verticalLineToRelative(-1.32f)
                horizontalLineToRelative(1.32f)
                close()
                moveTo(8.008f, 4.647f)
                lineTo(6.674f, 4.647f)
                verticalLineToRelative(-1.32f)
                horizontalLineToRelative(1.335f)
                close()
                moveTo(6.674f, 2.654f)
                lineTo(5.338f, 2.654f)
                verticalLineToRelative(-1.32f)
                horizontalLineToRelative(1.336f)
                close()
                moveTo(22.147f, 13.26f)
                lineToRelative(0.517f, -1.688f)
                lineTo(22.664f, 0.015f)
                curveToRelative(-6.045f, 0.0f, -6.674f, 2.317f, -6.674f, 4.531f)
                lineTo(15.99f, 17.24f)
                curveToRelative(0.0f, 0.657f, -0.064f, 1.354f, -0.197f, 2.037f)
                curveToRelative(3.205f, -0.583f, 5.296f, -2.565f, 6.354f, -6.016f)
                close()
            }
        }
        .build()
        return _ubiquiti!!
    }

private var _ubiquiti: VectorAsset? = null
