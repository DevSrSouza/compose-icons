package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.UserSwitch: ImageVector
    get() {
        if (_userSwitch != null) {
            return _userSwitch!!
        }
        _userSwitch = Builder(name = "UserSwitch", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(253.7f, 133.7f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, true, -1.7f, -8.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 120.0f)
                horizontalLineToRelative(15.6f)
                arcTo(87.9f, 87.9f, 0.0f, false, false, 54.1f, 80.3f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 43.0f, 82.6f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -2.4f, -11.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, true, 231.7f, 120.0f)
                horizontalLineTo(248.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.4f, 4.9f)
                arcTo(8.4f, 8.4f, 0.0f, false, true, 253.7f, 133.7f)
                close()
                moveTo(213.0f, 173.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.1f, 2.3f)
                arcToRelative(86.9f, 86.9f, 0.0f, false, true, -8.1f, 10.8f)
                horizontalLineToRelative(0.0f)
                arcToRelative(81.3f, 81.3f, 0.0f, false, false, -24.5f, -23.0f)
                arcToRelative(59.7f, 59.7f, 0.0f, false, true, -82.6f, 0.0f)
                arcToRelative(81.3f, 81.3f, 0.0f, false, false, -24.5f, 23.0f)
                horizontalLineToRelative(0.0f)
                arcTo(87.6f, 87.6f, 0.0f, false, true, 40.4f, 136.0f)
                horizontalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.4f, -4.9f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, -1.7f, -8.8f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.4f, 0.0f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, -1.7f, 8.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 8.0f, 136.0f)
                horizontalLineTo(24.3f)
                arcToRelative(103.7f, 103.7f, 0.0f, false, false, 34.5f, 69.6f)
                horizontalLineToRelative(0.0f)
                lineToRelative(0.4f, 0.3f)
                arcToRelative(103.9f, 103.9f, 0.0f, false, false, 156.2f, -21.5f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 213.0f, 173.4f)
                close()
                moveTo(128.0f, 164.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, -44.0f, -44.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 128.0f, 164.0f)
                close()
            }
        }
        .build()
        return _userSwitch!!
    }

private var _userSwitch: ImageVector? = null
