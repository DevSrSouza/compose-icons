package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Storefront: ImageVector
    get() {
        if (_storefront != null) {
            return _storefront!!
        }
        _storefront = Builder(name = "Storefront", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.0f, 95.8f)
                verticalLineToRelative(-0.2f)
                curveToRelative(0.0f, -0.2f, 0.0f, -0.3f, -0.1f, -0.4f)
                verticalLineToRelative(-0.3f)
                curveToRelative(0.0f, -0.1f, -0.1f, -0.3f, -0.1f, -0.4f)
                horizontalLineToRelative(0.0f)
                lineTo(215.4f, 44.2f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 202.0f, 34.0f)
                lineTo(54.0f, 34.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 40.6f, 44.2f)
                lineTo(26.2f, 94.4f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.1f, -0.1f, 0.3f, -0.1f, 0.4f)
                verticalLineToRelative(0.3f)
                curveToRelative(-0.1f, 0.1f, -0.1f, 0.2f, -0.1f, 0.4f)
                lineTo(26.0f, 112.0f)
                arcToRelative(37.9f, 37.9f, 0.0f, false, false, 16.0f, 31.0f)
                verticalLineToRelative(65.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(200.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(214.0f, 143.0f)
                arcToRelative(37.9f, 37.9f, 0.0f, false, false, 16.0f, -31.0f)
                lineTo(230.0f, 95.8f)
                close()
                moveTo(52.1f, 47.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 54.0f, 46.0f)
                lineTo(202.0f, 46.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.9f, 1.5f)
                lineTo(216.0f, 90.0f)
                lineTo(40.0f, 90.0f)
                close()
                moveTo(102.0f, 102.0f)
                horizontalLineToRelative(52.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -52.0f, 0.0f)
                close()
                moveTo(38.0f, 102.0f)
                lineTo(90.0f, 102.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(26.1f, 26.1f, 0.0f, false, true, -26.0f, 26.0f)
                arcToRelative(26.5f, 26.5f, 0.0f, false, true, -12.2f, -3.0f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, false, -1.6f, -1.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 38.0f, 112.0f)
                close()
                moveTo(202.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(56.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(54.0f, 148.7f)
                arcTo(40.9f, 40.9f, 0.0f, false, false, 64.0f, 150.0f)
                arcToRelative(38.1f, 38.1f, 0.0f, false, false, 32.0f, -17.5f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 64.0f, 0.0f)
                arcTo(38.1f, 38.1f, 0.0f, false, false, 192.0f, 150.0f)
                arcToRelative(40.9f, 40.9f, 0.0f, false, false, 10.0f, -1.3f)
                close()
                moveTo(205.8f, 134.0f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, false, -1.6f, 1.0f)
                arcToRelative(26.5f, 26.5f, 0.0f, false, true, -12.2f, 3.0f)
                arcToRelative(26.1f, 26.1f, 0.0f, false, true, -26.0f, -26.0f)
                lineTo(166.0f, 102.0f)
                horizontalLineToRelative(52.0f)
                verticalLineToRelative(10.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 205.8f, 134.0f)
                close()
            }
        }
        .build()
        return _storefront!!
    }

private var _storefront: ImageVector? = null
