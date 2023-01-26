package compose.icons.studioicons.round

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
import compose.icons.studioicons.RoundGroup

public val RoundGroup.FiberSmartRecord: ImageVector
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
                moveTo(17.0f, 5.55f)
                verticalLineToRelative(0.18f)
                curveToRelative(0.0f, 0.37f, 0.23f, 0.69f, 0.57f, 0.85f)
                curveTo(19.6f, 7.54f, 21.0f, 9.61f, 21.0f, 12.0f)
                reflectiveCurveToRelative(-1.4f, 4.46f, -3.43f, 5.42f)
                curveToRelative(-0.34f, 0.16f, -0.57f, 0.47f, -0.57f, 0.84f)
                verticalLineToRelative(0.18f)
                curveToRelative(0.0f, 0.68f, 0.71f, 1.11f, 1.32f, 0.82f)
                curveTo(21.08f, 18.01f, 23.0f, 15.23f, 23.0f, 12.0f)
                reflectiveCurveToRelative(-1.92f, -6.01f, -4.68f, -7.27f)
                curveToRelative(-0.61f, -0.28f, -1.32f, 0.14f, -1.32f, 0.82f)
                close()
            }
        }
        .build()
        return _fiberSmartRecord!!
    }

private var _fiberSmartRecord: ImageVector? = null
