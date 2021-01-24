package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Info: ImageVector
    get() {
        if (_info != null) {
            return _info!!
        }
        _info = Builder(name = "Info", defaultWidth = 192.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 192.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 424.229f)
                horizontalLineToRelative(20.0f)
                verticalLineTo(279.771f)
                horizontalLineTo(20.0f)
                curveToRelative(-11.046f, 0.0f, -20.0f, -8.954f, -20.0f, -20.0f)
                verticalLineTo(212.0f)
                curveToRelative(0.0f, -11.046f, 8.954f, -20.0f, 20.0f, -20.0f)
                horizontalLineToRelative(112.0f)
                curveToRelative(11.046f, 0.0f, 20.0f, 8.954f, 20.0f, 20.0f)
                verticalLineToRelative(212.229f)
                horizontalLineToRelative(20.0f)
                curveToRelative(11.046f, 0.0f, 20.0f, 8.954f, 20.0f, 20.0f)
                verticalLineTo(492.0f)
                curveToRelative(0.0f, 11.046f, -8.954f, 20.0f, -20.0f, 20.0f)
                horizontalLineTo(20.0f)
                curveToRelative(-11.046f, 0.0f, -20.0f, -8.954f, -20.0f, -20.0f)
                verticalLineToRelative(-47.771f)
                curveToRelative(0.0f, -11.046f, 8.954f, -20.0f, 20.0f, -20.0f)
                close()
                moveTo(96.0f, 0.0f)
                curveTo(56.235f, 0.0f, 24.0f, 32.235f, 24.0f, 72.0f)
                reflectiveCurveToRelative(32.235f, 72.0f, 72.0f, 72.0f)
                reflectiveCurveToRelative(72.0f, -32.235f, 72.0f, -72.0f)
                reflectiveCurveTo(135.764f, 0.0f, 96.0f, 0.0f)
                close()
            }
        }
        .build()
        return _info!!
    }

private var _info: ImageVector? = null
