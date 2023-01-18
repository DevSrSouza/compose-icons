package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.BagSharp: ImageVector
    get() {
        if (_bagSharp != null) {
            return _bagSharp!!
        }
        _bagSharp = Builder(name = "BagSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(372.0f, 160.0f)
                lineTo(372.0f, 148.0f)
                arcTo(116.13f, 116.13f, 0.0f, false, false, 258.89f, 32.0f)
                curveToRelative(-1.0f, 0.0f, -1.92f, 0.0f, -2.89f, 0.0f)
                reflectiveCurveToRelative(-1.93f, 0.0f, -2.89f, 0.0f)
                arcTo(116.13f, 116.13f, 0.0f, false, false, 140.0f, 148.0f)
                verticalLineToRelative(12.0f)
                lineTo(52.0f, 160.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(48.0f, 464.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(448.0f, 480.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(464.0f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                close()
                moveTo(332.0f, 160.0f)
                lineTo(180.0f, 160.0f)
                lineTo(180.0f, 149.0f)
                curveToRelative(0.0f, -41.84f, 33.41f, -76.56f, 75.25f, -77.0f)
                arcTo(76.08f, 76.08f, 0.0f, false, true, 332.0f, 148.0f)
                close()
            }
        }
        .build()
        return _bagSharp!!
    }

private var _bagSharp: ImageVector? = null
