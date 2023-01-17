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
                moveTo(17.187f, 19.181f)
                lineTo(24.0f, 4.755f)
                lineTo(0.0f, 12.386f)
                lineToRelative(9.196f, 1.963f)
                lineToRelative(0.043f, 4.896f)
                lineToRelative(2.759f, -2.617f)
                lineToRelative(-2.147f, -2.076f)
                lineToRelative(7.336f, 4.63f)
                close()
            }
        }
        .build()
        return _minutemailer!!
    }

private var _minutemailer: ImageVector? = null
