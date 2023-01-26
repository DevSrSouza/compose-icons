package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.AddToDrive: ImageVector
    get() {
        if (_addToDrive != null) {
            return _addToDrive!!
        }
        _addToDrive = Builder(name = "AddToDrive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 21.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(15.03f, 21.5f)
                horizontalLineTo(5.66f)
                curveToRelative(-0.72f, 0.0f, -1.38f, -0.38f, -1.73f, -1.0f)
                lineTo(1.57f, 16.4f)
                curveToRelative(-0.36f, -0.62f, -0.35f, -1.38f, 0.01f, -2.0f)
                lineTo(7.92f, 3.49f)
                curveTo(8.28f, 2.88f, 8.94f, 2.5f, 9.65f, 2.5f)
                horizontalLineToRelative(4.7f)
                curveToRelative(0.71f, 0.0f, 1.37f, 0.38f, 1.73f, 0.99f)
                lineToRelative(4.48f, 7.71f)
                curveTo(20.06f, 11.07f, 19.54f, 11.0f, 19.0f, 11.0f)
                curveToRelative(-0.28f, 0.0f, -0.56f, 0.02f, -0.84f, 0.06f)
                lineTo(14.35f, 4.5f)
                horizontalLineToRelative(-4.7f)
                lineTo(3.31f, 15.41f)
                lineToRelative(2.35f, 4.09f)
                horizontalLineToRelative(7.89f)
                curveTo(13.9f, 20.27f, 14.4f, 20.95f, 15.03f, 21.5f)
                close()
                moveTo(13.34f, 15.0f)
                curveTo(13.12f, 15.63f, 13.0f, 16.3f, 13.0f, 17.0f)
                horizontalLineTo(7.25f)
                lineToRelative(-0.73f, -1.27f)
                lineToRelative(4.58f, -7.98f)
                horizontalLineToRelative(1.8f)
                lineToRelative(2.53f, 4.42f)
                curveToRelative(-0.56f, 0.42f, -1.05f, 0.93f, -1.44f, 1.51f)
                lineToRelative(-2.0f, -3.49f)
                lineTo(9.25f, 15.0f)
                horizontalLineTo(13.34f)
                close()
            }
        }
        .build()
        return _addToDrive!!
    }

private var _addToDrive: ImageVector? = null
