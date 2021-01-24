package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.AlignCenter: ImageVector
    get() {
        if (_alignCenter != null) {
            return _alignCenter!!
        }
        _alignCenter = Builder(name = "AlignCenter", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(432.0f, 160.0f)
                lineTo(16.0f, 160.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(416.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                close()
                moveTo(432.0f, 416.0f)
                lineTo(16.0f, 416.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(416.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                close()
                moveTo(108.1f, 96.0f)
                horizontalLineToRelative(231.81f)
                arcTo(12.09f, 12.09f, 0.0f, false, false, 352.0f, 83.9f)
                lineTo(352.0f, 44.09f)
                arcTo(12.09f, 12.09f, 0.0f, false, false, 339.91f, 32.0f)
                lineTo(108.1f, 32.0f)
                arcTo(12.09f, 12.09f, 0.0f, false, false, 96.0f, 44.09f)
                lineTo(96.0f, 83.9f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 108.1f, 96.0f)
                close()
                moveTo(339.91f, 352.0f)
                arcTo(12.09f, 12.09f, 0.0f, false, false, 352.0f, 339.9f)
                verticalLineToRelative(-39.81f)
                arcTo(12.09f, 12.09f, 0.0f, false, false, 339.91f, 288.0f)
                lineTo(108.1f, 288.0f)
                arcTo(12.09f, 12.09f, 0.0f, false, false, 96.0f, 300.09f)
                verticalLineToRelative(39.81f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 12.1f, 12.1f)
                close()
            }
        }
        .build()
        return _alignCenter!!
    }

private var _alignCenter: ImageVector? = null
