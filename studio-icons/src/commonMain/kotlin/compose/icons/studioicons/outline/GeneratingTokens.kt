package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.GeneratingTokens: ImageVector
    get() {
        if (_generatingTokens != null) {
            return _generatingTokens!!
        }
        _generatingTokens = Builder(name = "GeneratingTokens", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f)
                curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f)
                curveTo(17.0f, 7.58f, 13.42f, 4.0f, 9.0f, 4.0f)
                close()
                moveTo(9.0f, 18.0f)
                curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.69f, 6.0f, 6.0f)
                reflectiveCurveTo(12.31f, 18.0f, 9.0f, 18.0f)
                close()
                moveTo(12.0f, 10.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(10.5f)
                close()
                moveTo(20.25f, 3.75f)
                lineTo(23.0f, 5.0f)
                lineToRelative(-2.75f, 1.25f)
                lineTo(19.0f, 9.0f)
                lineToRelative(-1.25f, -2.75f)
                lineTo(15.0f, 5.0f)
                lineToRelative(2.75f, -1.25f)
                lineTo(19.0f, 1.0f)
                lineTo(20.25f, 3.75f)
                close()
                moveTo(20.25f, 17.75f)
                lineTo(23.0f, 19.0f)
                lineToRelative(-2.75f, 1.25f)
                lineTo(19.0f, 23.0f)
                lineToRelative(-1.25f, -2.75f)
                lineTo(15.0f, 19.0f)
                lineToRelative(2.75f, -1.25f)
                lineTo(19.0f, 15.0f)
                lineTo(20.25f, 17.75f)
                close()
            }
        }
        .build()
        return _generatingTokens!!
    }

private var _generatingTokens: ImageVector? = null
