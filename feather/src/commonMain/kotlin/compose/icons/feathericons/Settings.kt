package compose.icons.feathericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.FeatherIcons

public val FeatherIcons.Settings: ImageVector
    get() {
        if (_settings != null) {
            return _settings!!
        }
        _settings = Builder(name = "Settings", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.4f, 15.0f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, false, 0.33f, 1.82f)
                lineToRelative(0.06f, 0.06f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 2.83f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.83f, 0.0f)
                lineToRelative(-0.06f, -0.06f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, false, -1.82f, -0.33f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, false, -1.0f, 1.51f)
                verticalLineTo(21.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-0.09f)
                arcTo(1.65f, 1.65f, 0.0f, false, false, 9.0f, 19.4f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, false, -1.82f, 0.33f)
                lineToRelative(-0.06f, 0.06f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.83f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.83f)
                lineToRelative(0.06f, -0.06f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, false, 0.33f, -1.82f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, false, -1.51f, -1.0f)
                horizontalLineTo(3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(0.09f)
                arcTo(1.65f, 1.65f, 0.0f, false, false, 4.6f, 9.0f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, false, -0.33f, -1.82f)
                lineToRelative(-0.06f, -0.06f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.83f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.83f, 0.0f)
                lineToRelative(0.06f, 0.06f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, false, 1.82f, 0.33f)
                horizontalLineTo(9.0f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, false, 1.0f, -1.51f)
                verticalLineTo(3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(0.09f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, false, 1.0f, 1.51f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, false, 1.82f, -0.33f)
                lineToRelative(0.06f, -0.06f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.83f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 2.83f)
                lineToRelative(-0.06f, 0.06f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, false, -0.33f, 1.82f)
                verticalLineTo(9.0f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, false, 1.51f, 1.0f)
                horizontalLineTo(21.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-0.09f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, false, -1.51f, 1.0f)
                close()
            }
        }
        .build()
        return _settings!!
    }

private var _settings: ImageVector? = null
