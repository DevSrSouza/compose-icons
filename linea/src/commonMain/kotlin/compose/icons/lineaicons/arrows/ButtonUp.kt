package compose.icons.lineaicons.arrows

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
import compose.icons.lineaicons.ArrowsGroup

public val ArrowsGroup.ButtonUp: ImageVector
    get() {
        if (_buttonUp != null) {
            return _buttonUp!!
        }
        _buttonUp = Builder(name = "ButtonUp", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(48.0f, 17.0f)
                curveToRelative(0.0f, -8.837f, -7.163f, -16.0f, -16.0f, -16.0f)
                reflectiveCurveTo(16.0f, 8.163f, 16.0f, 17.0f)
                verticalLineToRelative(30.0f)
                curveToRelative(0.0f, 8.837f, 7.163f, 16.0f, 16.0f, 16.0f)
                reflectiveCurveToRelative(16.0f, -7.163f, 16.0f, -16.0f)
                verticalLineTo(17.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 17.0f)
                moveToRelative(-12.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 24.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -24.0f, 0.0f)
            }
        }
        .build()
        return _buttonUp!!
    }

private var _buttonUp: ImageVector? = null
