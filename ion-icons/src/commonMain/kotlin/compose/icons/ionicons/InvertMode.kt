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

public val IonIcons.InvertMode: ImageVector
    get() {
        if (_invertMode != null) {
            return _invertMode!!
        }
        _invertMode = Builder(name = "InvertMode", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-208.0f, 0.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, true, 416.0f, 0.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, true, -416.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 176.0f)
                verticalLineTo(336.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 0.0f, -160.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                verticalLineTo(176.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 0.0f, 160.0f)
                verticalLineTo(464.0f)
                curveTo(141.12f, 464.0f, 48.0f, 370.88f, 48.0f, 256.0f)
                reflectiveCurveTo(141.12f, 48.0f, 256.0f, 48.0f)
                close()
            }
        }
        .build()
        return _invertMode!!
    }

private var _invertMode: ImageVector? = null
