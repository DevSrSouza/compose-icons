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

public val BaselineGroup.DeveloperBoardOff: ImageVector
    get() {
        if (_developerBoardOff != null) {
            return _developerBoardOff!!
        }
        _developerBoardOff = Builder(name = "DeveloperBoardOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.83f, 5.0f)
                horizontalLineTo(18.0f)
                verticalLineToRelative(10.17f)
                lineTo(19.83f, 17.0f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(5.83f)
                lineTo(7.83f, 5.0f)
                close()
                moveTo(12.0f, 9.17f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.17f)
                lineTo(12.0f, 9.17f)
                close()
                moveTo(9.83f, 7.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(1.17f)
                lineTo(9.83f, 7.0f)
                close()
                moveTo(13.83f, 11.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(2.17f)
                lineTo(13.83f, 11.0f)
                close()
                moveTo(18.0f, 21.0f)
                curveToRelative(0.06f, 0.0f, 0.11f, 0.0f, 0.16f, -0.01f)
                lineToRelative(2.32f, 2.32f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.1f, 2.1f)
                lineTo(0.69f, 3.51f)
                lineToRelative(1.32f, 1.32f)
                curveTo(2.0f, 4.89f, 2.0f, 4.94f, 2.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(4.0f, 19.0f)
                verticalLineTo(6.83f)
                lineToRelative(2.0f, 2.0f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(3.17f)
                lineToRelative(1.0f, 1.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.17f)
                lineToRelative(1.0f, 1.0f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(2.17f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _developerBoardOff!!
    }

private var _developerBoardOff: ImageVector? = null
