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

public val OutlineGroup.AddHome: ImageVector
    get() {
        if (_addHome != null) {
            return _addHome!!
        }
        _addHome = Builder(name = "AddHome", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.5f)
                lineToRelative(6.0f, 4.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.7f, 0.0f, 1.37f, 0.1f, 2.0f, 0.29f)
                verticalLineTo(9.0f)
                lineToRelative(-8.0f, -6.0f)
                lineTo(4.0f, 9.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(7.68f)
                curveToRelative(-0.3f, -0.62f, -0.5f, -1.29f, -0.6f, -2.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-9.0f)
                lineTo(12.0f, 5.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 13.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f)
                reflectiveCurveTo(20.76f, 13.0f, 18.0f, 13.0f)
                close()
                moveTo(21.0f, 18.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineTo(15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.5f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.5f)
                horizontalLineTo(21.0f)
                verticalLineTo(18.5f)
                close()
            }
        }
        .build()
        return _addHome!!
    }

private var _addHome: ImageVector? = null
