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

public val OutlineGroup.WbIncandescent: ImageVector
    get() {
        if (_wbIncandescent != null) {
            return _wbIncandescent!!
        }
        _wbIncandescent = Builder(name = "WbIncandescent", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.55f, 19.09f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.79f, -1.8f)
                lineToRelative(-1.41f, -1.41f)
                close()
                moveTo(11.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(1.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                lineTo(1.0f, 13.0f)
                close()
                moveTo(13.0f, 4.05f)
                verticalLineToRelative(3.96f)
                lineToRelative(1.0f, 0.58f)
                curveToRelative(1.24f, 0.72f, 2.0f, 2.04f, 2.0f, 3.46f)
                curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.79f, -4.0f, -4.0f)
                curveToRelative(0.0f, -1.42f, 0.77f, -2.74f, 2.0f, -3.46f)
                lineToRelative(1.0f, -0.58f)
                lineTo(11.0f, 4.05f)
                horizontalLineToRelative(2.0f)
                moveToRelative(2.0f, -2.0f)
                lineTo(9.0f, 2.05f)
                verticalLineToRelative(4.81f)
                curveTo(7.21f, 7.9f, 6.0f, 9.83f, 6.0f, 12.05f)
                curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f)
                curveToRelative(0.0f, -2.22f, -1.21f, -4.15f, -3.0f, -5.19f)
                lineTo(15.0f, 2.05f)
                close()
                moveTo(20.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(17.24f, 18.71f)
                lineToRelative(1.79f, 1.8f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-1.8f, -1.79f)
                close()
            }
        }
        .build()
        return _wbIncandescent!!
    }

private var _wbIncandescent: ImageVector? = null
