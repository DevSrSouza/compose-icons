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

public val SimpleIcons.Minutemailer: ImageVector
    get() {
        if (_minutemailer != null) {
            return _minutemailer!!
        }
        _minutemailer = Builder(name = "Minutemailer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.564f, 2.703f)
                lineToRelative(3.45f, 3.734f)
                lineToRelative(-2.434f, 4.798f)
                lineToRelative(5.14f, -0.921f)
                lineToRelative(2.34f, 5.646f)
                lineTo(24.0f, 2.926f)
                lineTo(5.564f, 2.703f)
                close()
                moveTo(4.928f, 10.791f)
                lineToRelative(0.957f, -0.787f)
                lineToRelative(-1.234f, 0.39f)
                lineToRelative(-0.126f, -0.18f)
                lineToRelative(0.51f, -0.495f)
                lineToRelative(-0.669f, 0.27f)
                curveTo(1.813f, 10.979f, 0.0f, 13.455f, 0.0f, 16.35f)
                curveToRelative(0.0f, 1.951f, 0.822f, 3.705f, 2.133f, 4.947f)
                curveToRelative(-0.563f, -0.99f, -0.885f, -2.134f, -0.885f, -3.355f)
                curveToRelative(0.0f, -2.865f, 1.809f, -5.415f, 4.315f, -6.42f)
                lineToRelative(0.315f, -0.766f)
                lineToRelative(-0.75f, 0.331f)
                lineToRelative(-0.211f, -0.285f)
                lineToRelative(0.011f, -0.011f)
                close()
                moveTo(9.292f, 8.821f)
                lineTo(10.89f, 6.0f)
                lineToRelative(9.398f, -2.201f)
                lineTo(9.292f, 8.821f)
                close()
            }
        }
        .build()
        return _minutemailer!!
    }

private var _minutemailer: ImageVector? = null
