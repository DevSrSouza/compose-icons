package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.FrontHand: ImageVector
    get() {
        if (_frontHand != null) {
            return _frontHand!!
        }
        _frontHand = Builder(name = "FrontHand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 8.0f)
                verticalLineToRelative(7.0f)
                horizontalLineTo(18.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.04f, 1.53f, -3.72f, 3.5f, -3.97f)
                verticalLineTo(2.0f)
                horizontalLineTo(15.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(1.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(4.5f)
                horizontalLineTo(4.5f)
                verticalLineToRelative(11.25f)
                curveToRelative(0.0f, 4.56f, 3.69f, 8.25f, 8.25f, 8.25f)
                reflectiveCurveTo(21.0f, 20.31f, 21.0f, 15.75f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.5f)
                close()
            }
        }
        .build()
        return _frontHand!!
    }

private var _frontHand: ImageVector? = null
