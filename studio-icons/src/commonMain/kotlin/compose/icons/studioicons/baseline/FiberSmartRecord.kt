package compose.icons.studioicons.baseline

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
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.FiberSmartRecord: ImageVector
    get() {
        if (_fiberSmartRecord != null) {
            return _fiberSmartRecord!!
        }
        _fiberSmartRecord = Builder(name = "FiberSmartRecord", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 12.0f)
                moveToRelative(-8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -16.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 4.26f)
                verticalLineToRelative(2.09f)
                curveToRelative(2.33f, 0.82f, 4.0f, 3.04f, 4.0f, 5.65f)
                reflectiveCurveToRelative(-1.67f, 4.83f, -4.0f, 5.65f)
                verticalLineToRelative(2.09f)
                curveToRelative(3.45f, -0.89f, 6.0f, -4.01f, 6.0f, -7.74f)
                reflectiveCurveToRelative(-2.55f, -6.85f, -6.0f, -7.74f)
                close()
            }
        }
        .build()
        return _fiberSmartRecord!!
    }

private var _fiberSmartRecord: ImageVector? = null
