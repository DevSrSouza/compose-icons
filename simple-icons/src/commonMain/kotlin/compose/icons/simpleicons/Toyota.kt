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

public val SimpleIcons.Toyota: ImageVector
    get() {
        if (_toyota != null) {
            return _toyota!!
        }
        _toyota = Builder(name = "Toyota", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.848f)
                curveTo(5.223f, 3.848f, 0.0f, 7.298f, 0.0f, 12.0f)
                curveToRelative(0.0f, 4.702f, 5.224f, 8.152f, 12.0f, 8.152f)
                reflectiveCurveTo(24.0f, 16.702f, 24.0f, 12.0f)
                curveToRelative(0.0f, -4.702f, -5.223f, -8.152f, -12.0f, -8.152f)
                close()
                moveTo(19.334f, 7.687f)
                curveToRelative(0.0f, 1.08f, -1.725f, 1.913f, -4.488f, 2.246f)
                curveToRelative(-0.26f, -2.58f, -1.005f, -4.279f, -1.963f, -4.913f)
                curveToRelative(2.948f, 0.184f, 6.45f, 1.227f, 6.45f, 2.667f)
                close()
                moveTo(12.0f, 16.401f)
                curveToRelative(-0.96f, 0.0f, -1.746f, -1.5f, -1.808f, -4.389f)
                curveToRelative(0.577f, 0.047f, 1.18f, 0.072f, 1.808f, 0.072f)
                curveToRelative(0.628f, 0.0f, 1.23f, -0.025f, 1.807f, -0.072f)
                curveToRelative(-0.061f, 2.89f, -0.847f, 4.389f, -1.807f, 4.389f)
                close()
                moveTo(12.0f, 10.093f)
                curveToRelative(-0.59f, 0.0f, -1.155f, -0.019f, -1.69f, -0.054f)
                curveToRelative(0.261f, -1.728f, 0.92f, -3.15f, 1.69f, -3.15f)
                curveToRelative(0.77f, 0.0f, 1.428f, 1.422f, 1.689f, 3.15f)
                curveToRelative(-0.535f, 0.034f, -1.099f, 0.054f, -1.689f, 0.054f)
                close()
                moveTo(11.118f, 5.018f)
                curveToRelative(-0.956f, 0.633f, -1.706f, 2.333f, -1.964f, 4.915f)
                curveTo(6.391f, 9.6f, 4.665f, 8.767f, 4.665f, 7.687f)
                curveToRelative(0.0f, -1.44f, 3.504f, -2.49f, 6.453f, -2.669f)
                close()
                moveTo(2.037f, 11.68f)
                arcToRelative(5.265f, 5.265f, 0.0f, false, true, 1.048f, -3.164f)
                curveToRelative(0.27f, 1.547f, 2.522f, 2.881f, 5.972f, 3.37f)
                lineTo(9.057f, 12.0f)
                curveToRelative(0.0f, 3.772f, 0.879f, 6.203f, 2.087f, 6.97f)
                curveToRelative(-5.107f, -0.321f, -9.107f, -3.48f, -9.107f, -7.29f)
                close()
                moveTo(12.86f, 18.97f)
                curveToRelative(1.207f, -0.767f, 2.087f, -3.198f, 2.087f, -6.97f)
                verticalLineToRelative(-0.115f)
                curveToRelative(3.447f, -0.488f, 5.704f, -1.826f, 5.972f, -3.37f)
                arcToRelative(5.26f, 5.26f, 0.0f, false, true, 1.049f, 3.165f)
                curveToRelative(-0.004f, 3.81f, -4.008f, 6.969f, -9.109f, 7.29f)
                close()
            }
        }
        .build()
        return _toyota!!
    }

private var _toyota: ImageVector? = null
