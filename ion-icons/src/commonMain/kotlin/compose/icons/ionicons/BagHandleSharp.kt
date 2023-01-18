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

public val IonIcons.BagHandleSharp: ImageVector
    get() {
        if (_bagHandleSharp != null) {
            return _bagHandleSharp!!
        }
        _bagHandleSharp = Builder(name = "BagHandleSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(460.0f, 160.0f)
                lineTo(372.0f, 160.0f)
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
                arcTo(4.0f, 4.0f, 0.0f, false, false, 460.0f, 160.0f)
                close()
                moveTo(180.0f, 149.0f)
                curveToRelative(0.0f, -41.84f, 33.41f, -76.56f, 75.25f, -77.0f)
                arcTo(76.08f, 76.08f, 0.0f, false, true, 332.0f, 148.0f)
                verticalLineToRelative(12.0f)
                lineTo(180.0f, 160.0f)
                close()
                moveTo(368.0f, 240.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, false, true, -224.0f, 0.0f)
                lineTo(144.0f, 208.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 160.0f, 0.0f)
                lineTo(336.0f, 208.0f)
                horizontalLineToRelative(32.0f)
                close()
            }
        }
        .build()
        return _bagHandleSharp!!
    }

private var _bagHandleSharp: ImageVector? = null
