package compose.icons.lineaicons.basic

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
import compose.icons.lineaicons.BasicGroup

public val BasicGroup.MagicMouse: ImageVector
    get() {
        if (_magicMouse != null) {
            return _magicMouse!!
        }
        _magicMouse = Builder(name = "MagicMouse", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(48.0f, 17.0f)
                curveToRelative(0.0f, -8.836f, -7.164f, -16.0f, -16.0f, -16.0f)
                reflectiveCurveTo(16.0f, 8.164f, 16.0f, 17.0f)
                verticalLineToRelative(30.0f)
                curveToRelative(0.0f, 8.836f, 7.164f, 16.0f, 16.0f, 16.0f)
                reflectiveCurveToRelative(16.0f, -7.164f, 16.0f, -16.0f)
                verticalLineTo(17.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 10.0f)
                lineTo(32.0f, 18.0f)
            }
        }
        .build()
        return _magicMouse!!
    }

private var _magicMouse: ImageVector? = null
