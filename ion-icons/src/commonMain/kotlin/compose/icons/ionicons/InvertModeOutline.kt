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

public val IonIcons.InvertModeOutline: ImageVector
    get() {
        if (_invertModeOutline != null) {
            return _invertModeOutline!!
        }
        _invertModeOutline = Builder(name = "InvertModeOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
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
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, 0.0f, -160.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                verticalLineTo(176.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, 0.0f, 160.0f)
                verticalLineTo(464.0f)
                curveToRelative(114.88f, 0.0f, 208.0f, -93.12f, 208.0f, -208.0f)
                reflectiveCurveTo(370.88f, 48.0f, 256.0f, 48.0f)
                close()
            }
        }
        .build()
        return _invertModeOutline!!
    }

private var _invertModeOutline: ImageVector? = null
