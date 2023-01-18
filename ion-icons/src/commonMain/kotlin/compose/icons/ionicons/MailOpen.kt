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

public val IonIcons.MailOpen: ImageVector
    get() {
        if (_mailOpen != null) {
            return _mailOpen!!
        }
        _mailOpen = Builder(name = "MailOpen", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.67f, 154.45f)
                lineTo(274.1f, 68.2f)
                arcToRelative(41.1f, 41.1f, 0.0f, false, false, -36.2f, 0.0f)
                lineTo(63.33f, 154.45f)
                arcTo(55.6f, 55.6f, 0.0f, false, false, 32.0f, 204.53f)
                verticalLineTo(389.14f)
                curveToRelative(0.0f, 30.88f, 25.42f, 56.0f, 56.67f, 56.0f)
                horizontalLineTo(423.33f)
                curveToRelative(31.25f, 0.0f, 56.67f, -25.12f, 56.67f, -56.0f)
                verticalLineTo(204.53f)
                arcTo(55.6f, 55.6f, 0.0f, false, false, 448.67f, 154.45f)
                close()
                moveTo(252.38f, 96.82f)
                arcToRelative(8.22f, 8.22f, 0.0f, false, true, 7.24f, 0.0f)
                lineTo(429.0f, 180.48f)
                lineToRelative(-172.0f, 85.0f)
                arcToRelative(8.22f, 8.22f, 0.0f, false, true, -7.24f, 0.0f)
                lineTo(80.35f, 181.81f)
                close()
            }
        }
        .build()
        return _mailOpen!!
    }

private var _mailOpen: ImageVector? = null
