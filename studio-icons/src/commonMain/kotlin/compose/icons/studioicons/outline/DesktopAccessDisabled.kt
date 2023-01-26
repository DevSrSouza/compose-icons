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

public val OutlineGroup.DesktopAccessDisabled: ImageVector
    get() {
        if (_desktopAccessDisabled != null) {
            return _desktopAccessDisabled!!
        }
        _desktopAccessDisabled = Builder(name = "DesktopAccessDisabled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.41f, 1.69f)
                lineTo(0.0f, 3.1f)
                lineToRelative(1.0f, 0.99f)
                verticalLineTo(16.0f)
                curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f)
                horizontalLineTo(10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(0.9f)
                lineToRelative(6.0f, 6.0f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-20.9f, -20.9f)
                close()
                moveTo(2.99f, 16.0f)
                verticalLineTo(6.09f)
                lineTo(12.9f, 16.0f)
                horizontalLineTo(2.99f)
                close()
                moveTo(4.55f, 2.0f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-2.45f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineToRelative(0.44f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(4.55f)
                close()
            }
        }
        .build()
        return _desktopAccessDisabled!!
    }

private var _desktopAccessDisabled: ImageVector? = null
