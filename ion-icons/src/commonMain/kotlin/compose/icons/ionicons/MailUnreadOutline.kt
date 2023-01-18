package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.MailUnreadOutline: ImageVector
    get() {
        if (_mailUnreadOutline != null) {
            return _mailUnreadOutline!!
        }
        _mailUnreadOutline = Builder(name = "MailUnreadOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(320.0f, 96.0f)
                horizontalLineTo(88.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -40.0f, 40.0f)
                verticalLineTo(376.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, 40.0f)
                horizontalLineTo(422.73f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, -40.0f)
                verticalLineTo(239.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(112.0f, 160.0f)
                lineToRelative(144.0f, 112.0f)
                lineToRelative(87.0f, -65.67f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(431.95f, 128.05f)
                moveToRelative(-47.95f, 0.0f)
                arcToRelative(47.95f, 47.95f, 0.0f, true, true, 95.9f, 0.0f)
                arcToRelative(47.95f, 47.95f, 0.0f, true, true, -95.9f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(432.0f, 192.0f)
                arcToRelative(63.95f, 63.95f, 0.0f, true, true, 63.95f, -63.95f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 432.0f, 192.0f)
                close()
                moveTo(432.0f, 96.1f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 31.95f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 432.0f, 96.1f)
                close()
            }
        }
        .build()
        return _mailUnreadOutline!!
    }

private var _mailUnreadOutline: ImageVector? = null
