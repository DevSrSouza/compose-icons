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

public val RemixIcons.FacebookBoxLine: ImageVector
    get() {
        if (_facebookBoxLine != null) {
            return _facebookBoxLine!!
        }
        _facebookBoxLine = Builder(name = "FacebookBoxLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 19.0f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.654f)
                curveToRelative(0.0f, -1.337f, 0.14f, -1.822f, 0.4f, -2.311f)
                arcTo(2.726f, 2.726f, 0.0f, false, true, 13.536f, 6.9f)
                curveToRelative(0.382f, -0.205f, 0.857f, -0.328f, 1.687f, -0.381f)
                curveToRelative(0.329f, -0.021f, 0.755f, 0.005f, 1.278f, 0.08f)
                verticalLineToRelative(1.9f)
                horizontalLineTo(16.0f)
                curveToRelative(-0.917f, 0.0f, -1.296f, 0.043f, -1.522f, 0.164f)
                arcToRelative(0.727f, 0.727f, 0.0f, false, false, -0.314f, 0.314f)
                curveToRelative(-0.12f, 0.226f, -0.164f, 0.45f, -0.164f, 1.368f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(2.5f)
                lineToRelative(-0.5f, 2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(4.0f, 3.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _facebookBoxLine!!
    }

private var _facebookBoxLine: ImageVector? = null
