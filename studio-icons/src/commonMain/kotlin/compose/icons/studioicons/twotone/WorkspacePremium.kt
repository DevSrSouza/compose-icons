package compose.icons.studioicons.twotone

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
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.WorkspacePremium: ImageVector
    get() {
        if (_workspacePremium != null) {
            return _workspacePremium!!
        }
        _workspacePremium = Builder(name = "WorkspacePremium", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveToRelative(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.69f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f)
                reflectiveCurveTo(15.31f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(14.31f, 13.69f)
                lineTo(12.0f, 11.93f)
                lineToRelative(-2.32f, 1.76f)
                lineToRelative(0.88f, -2.85f)
                lineTo(8.25f, 9.0f)
                horizontalLineToRelative(2.84f)
                lineTo(12.0f, 6.19f)
                lineTo(12.91f, 9.0f)
                horizontalLineToRelative(2.84f)
                lineToRelative(-2.32f, 1.84f)
                lineTo(14.31f, 13.69f)
                close()
                moveTo(12.0f, 19.0f)
                lineToRelative(-4.0f, 1.02f)
                verticalLineToRelative(-3.1f)
                curveTo(9.18f, 17.6f, 10.54f, 18.0f, 12.0f, 18.0f)
                reflectiveCurveToRelative(2.82f, -0.4f, 4.0f, -1.08f)
                verticalLineToRelative(3.1f)
                lineTo(12.0f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.68f, 13.69f)
                lineTo(12.0f, 11.93f)
                lineToRelative(2.31f, 1.76f)
                lineToRelative(-0.88f, -2.85f)
                lineTo(15.75f, 9.0f)
                horizontalLineToRelative(-2.84f)
                lineTo(12.0f, 6.19f)
                lineTo(11.09f, 9.0f)
                horizontalLineTo(8.25f)
                lineToRelative(2.31f, 1.84f)
                lineTo(9.68f, 13.69f)
                close()
                moveTo(20.0f, 10.0f)
                curveToRelative(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f)
                reflectiveCurveToRelative(-8.0f, 3.58f, -8.0f, 8.0f)
                curveToRelative(0.0f, 2.03f, 0.76f, 3.87f, 2.0f, 5.28f)
                verticalLineTo(23.0f)
                lineToRelative(6.0f, -2.0f)
                lineToRelative(6.0f, 2.0f)
                verticalLineToRelative(-7.72f)
                curveTo(19.24f, 13.87f, 20.0f, 12.03f, 20.0f, 10.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.69f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.69f, -6.0f, -6.0f)
                reflectiveCurveTo(8.69f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(12.0f, 19.0f)
                lineToRelative(-4.0f, 1.02f)
                verticalLineToRelative(-3.1f)
                curveTo(9.18f, 17.6f, 10.54f, 18.0f, 12.0f, 18.0f)
                reflectiveCurveToRelative(2.82f, -0.4f, 4.0f, -1.08f)
                verticalLineToRelative(3.1f)
                lineTo(12.0f, 19.0f)
                close()
            }
        }
        .build()
        return _workspacePremium!!
    }

private var _workspacePremium: ImageVector? = null
