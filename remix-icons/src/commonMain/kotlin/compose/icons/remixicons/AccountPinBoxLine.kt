package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.AccountPinBoxLine: ImageVector
    get() {
        if (_accountPinBoxLine != null) {
            return _accountPinBoxLine!!
        }
        _accountPinBoxLine = Builder(name = "AccountPinBoxLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 21.0f)
                lineToRelative(-2.0f, 2.0f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(4.995f, 21.0f)
                arcTo(1.995f, 1.995f, 0.0f, false, true, 3.0f, 19.005f)
                lineTo(3.0f, 4.995f)
                curveTo(3.0f, 3.893f, 3.893f, 3.0f, 4.995f, 3.0f)
                horizontalLineToRelative(14.01f)
                curveTo(20.107f, 3.0f, 21.0f, 3.893f, 21.0f, 4.995f)
                verticalLineToRelative(14.01f)
                arcTo(1.995f, 1.995f, 0.0f, false, true, 19.005f, 21.0f)
                lineTo(14.0f, 21.0f)
                close()
                moveTo(19.0f, 19.0f)
                lineTo(19.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(5.828f)
                lineTo(12.0f, 20.172f)
                lineTo(13.172f, 19.0f)
                lineTo(19.0f, 19.0f)
                close()
                moveTo(7.972f, 18.18f)
                arcToRelative(9.983f, 9.983f, 0.0f, false, true, -1.751f, -0.978f)
                arcTo(6.994f, 6.994f, 0.0f, false, true, 12.102f, 14.0f)
                curveToRelative(2.4f, 0.0f, 4.517f, 1.207f, 5.778f, 3.047f)
                arcToRelative(9.995f, 9.995f, 0.0f, false, true, -1.724f, 1.025f)
                arcTo(4.993f, 4.993f, 0.0f, false, false, 12.102f, 16.0f)
                curveToRelative(-1.715f, 0.0f, -3.23f, 0.864f, -4.13f, 2.18f)
                close()
                moveTo(12.0f, 13.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 0.0f, -7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, 7.0f)
                close()
                moveTo(12.0f, 11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                close()
            }
        }
        .build()
        return _accountPinBoxLine!!
    }

private var _accountPinBoxLine: ImageVector? = null
