package compose.icons.studioicons.outline

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
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.Church: ImageVector
    get() {
        if (_church != null) {
            return _church!!
        }
        _church = Builder(name = "Church", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 12.22f)
                verticalLineTo(9.0f)
                lineToRelative(-5.0f, -2.5f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.5f)
                lineTo(6.0f, 9.0f)
                verticalLineToRelative(3.22f)
                lineTo(2.0f, 14.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-8.0f)
                lineTo(18.0f, 12.22f)
                close()
                moveTo(20.0f, 20.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.04f)
                curveToRelative(0.0f, -1.69f, -1.35f, -3.06f, -3.0f, -3.06f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.37f, -3.0f, 3.06f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-4.79f)
                lineToRelative(4.0f, -1.81f)
                verticalLineToRelative(-3.35f)
                lineTo(12.0f, 8.0f)
                lineToRelative(4.0f, 2.04f)
                verticalLineToRelative(3.35f)
                lineToRelative(4.0f, 1.81f)
                verticalLineTo(20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
        }
        .build()
        return _church!!
    }

private var _church: ImageVector? = null
