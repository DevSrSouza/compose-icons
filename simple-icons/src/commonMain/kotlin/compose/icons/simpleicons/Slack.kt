package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Slack: ImageVector
    get() {
        if (_slack != null) {
            return _slack!!
        }
        _slack = Builder(name = "Slack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.042f, 15.165f)
                arcToRelative(2.528f, 2.528f, 0.0f, false, true, -2.52f, 2.523f)
                arcTo(2.528f, 2.528f, 0.0f, false, true, 0.0f, 15.165f)
                arcToRelative(2.527f, 2.527f, 0.0f, false, true, 2.522f, -2.52f)
                horizontalLineToRelative(2.52f)
                verticalLineToRelative(2.52f)
                close()
                moveTo(6.313f, 15.165f)
                arcToRelative(2.527f, 2.527f, 0.0f, false, true, 2.521f, -2.52f)
                arcToRelative(2.527f, 2.527f, 0.0f, false, true, 2.521f, 2.52f)
                verticalLineToRelative(6.313f)
                arcTo(2.528f, 2.528f, 0.0f, false, true, 8.834f, 24.0f)
                arcToRelative(2.528f, 2.528f, 0.0f, false, true, -2.521f, -2.522f)
                verticalLineToRelative(-6.313f)
                close()
                moveTo(8.834f, 5.042f)
                arcToRelative(2.528f, 2.528f, 0.0f, false, true, -2.521f, -2.52f)
                arcTo(2.528f, 2.528f, 0.0f, false, true, 8.834f, 0.0f)
                arcToRelative(2.528f, 2.528f, 0.0f, false, true, 2.521f, 2.522f)
                verticalLineToRelative(2.52f)
                horizontalLineTo(8.834f)
                close()
                moveTo(8.834f, 6.313f)
                arcToRelative(2.528f, 2.528f, 0.0f, false, true, 2.521f, 2.521f)
                arcToRelative(2.528f, 2.528f, 0.0f, false, true, -2.521f, 2.521f)
                horizontalLineTo(2.522f)
                arcTo(2.528f, 2.528f, 0.0f, false, true, 0.0f, 8.834f)
                arcToRelative(2.528f, 2.528f, 0.0f, false, true, 2.522f, -2.521f)
                horizontalLineToRelative(6.312f)
                close()
                moveTo(18.956f, 8.834f)
                arcToRelative(2.528f, 2.528f, 0.0f, false, true, 2.522f, -2.521f)
                arcTo(2.528f, 2.528f, 0.0f, false, true, 24.0f, 8.834f)
                arcToRelative(2.528f, 2.528f, 0.0f, false, true, -2.522f, 2.521f)
                horizontalLineToRelative(-2.522f)
                verticalLineTo(8.834f)
                close()
                moveTo(17.688f, 8.834f)
                arcToRelative(2.528f, 2.528f, 0.0f, false, true, -2.523f, 2.521f)
                arcToRelative(2.527f, 2.527f, 0.0f, false, true, -2.52f, -2.521f)
                verticalLineTo(2.522f)
                arcTo(2.527f, 2.527f, 0.0f, false, true, 15.165f, 0.0f)
                arcToRelative(2.528f, 2.528f, 0.0f, false, true, 2.523f, 2.522f)
                verticalLineToRelative(6.312f)
                close()
                moveTo(15.165f, 18.956f)
                arcToRelative(2.528f, 2.528f, 0.0f, false, true, 2.523f, 2.522f)
                arcTo(2.528f, 2.528f, 0.0f, false, true, 15.165f, 24.0f)
                arcToRelative(2.527f, 2.527f, 0.0f, false, true, -2.52f, -2.522f)
                verticalLineToRelative(-2.522f)
                horizontalLineToRelative(2.52f)
                close()
                moveTo(15.165f, 17.688f)
                arcToRelative(2.527f, 2.527f, 0.0f, false, true, -2.52f, -2.523f)
                arcToRelative(2.526f, 2.526f, 0.0f, false, true, 2.52f, -2.52f)
                horizontalLineToRelative(6.313f)
                arcTo(2.527f, 2.527f, 0.0f, false, true, 24.0f, 15.165f)
                arcToRelative(2.528f, 2.528f, 0.0f, false, true, -2.522f, 2.523f)
                horizontalLineToRelative(-6.313f)
                close()
            }
        }
        .build()
        return _slack!!
    }

private var _slack: ImageVector? = null
