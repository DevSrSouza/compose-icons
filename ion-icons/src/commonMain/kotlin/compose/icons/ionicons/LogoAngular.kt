package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.LogoAngular: ImageVector
    get() {
        if (_logoAngular != null) {
            return _logoAngular!!
        }
        _logoAngular = Builder(name = "LogoAngular", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.57f, 256.0f)
                lineToRelative(84.85f, 0.0f)
                lineToRelative(-42.43f, -89.36f)
                lineToRelative(-42.42f, 89.36f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 32.0f)
                lineTo(32.0f, 112.0f)
                lineTo(78.12f, 384.0f)
                lineTo(256.0f, 480.0f)
                lineToRelative(177.75f, -96.0f)
                lineTo(480.0f, 112.0f)
                close()
                moveTo(344.0f, 352.0f)
                lineTo(317.41f, 296.0f)
                lineTo(194.58f, 296.0f)
                lineTo(168.0f, 352.0f)
                lineTo(128.0f, 352.0f)
                lineTo(256.0f, 72.0f)
                lineTo(384.0f, 352.0f)
                close()
            }
        }
        .build()
        return _logoAngular!!
    }

private var _logoAngular: ImageVector? = null
