package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.Reload: ImageVector
    get() {
        if (_reload != null) {
            return _reload!!
        }
        _reload = Builder(name = "Reload", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(400.0f, 148.0f)
                lineToRelative(-21.12f, -24.57f)
                arcTo(191.43f, 191.43f, 0.0f, false, false, 240.0f, 64.0f)
                curveTo(134.0f, 64.0f, 48.0f, 150.0f, 48.0f, 256.0f)
                reflectiveCurveToRelative(86.0f, 192.0f, 192.0f, 192.0f)
                arcTo(192.09f, 192.09f, 0.0f, false, false, 421.07f, 320.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 97.42f)
                verticalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(337.42f)
                curveToRelative(-14.26f, 0.0f, -21.4f, -17.23f, -11.32f, -27.31f)
                lineTo(436.69f, 86.1f)
                curveTo(446.77f, 76.0f, 464.0f, 83.16f, 464.0f, 97.42f)
                close()
            }
        }
        .build()
        return _reload!!
    }

private var _reload: ImageVector? = null
