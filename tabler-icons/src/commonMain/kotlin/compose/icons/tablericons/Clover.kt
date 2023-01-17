package compose.icons.tablericons

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
import compose.icons.TablerIcons

public val TablerIcons.Clover: ImageVector
    get() {
        if (_clover != null) {
            return _clover!!
        }
        _clover = Builder(name = "Clover", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                lineToRelative(-3.397f, -3.44f)
                arcToRelative(2.104f, 2.104f, 0.0f, false, true, 0.0f, -2.95f)
                arcToRelative(2.04f, 2.04f, 0.0f, false, true, 2.912f, 0.0f)
                lineToRelative(0.485f, 0.39f)
                lineToRelative(0.485f, -0.39f)
                arcToRelative(2.04f, 2.04f, 0.0f, false, true, 2.912f, 0.0f)
                arcToRelative(2.104f, 2.104f, 0.0f, false, true, 0.0f, 2.95f)
                lineToRelative(-3.397f, 3.44f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 14.0f)
                lineToRelative(-3.397f, 3.44f)
                arcToRelative(2.104f, 2.104f, 0.0f, false, false, 0.0f, 2.95f)
                arcToRelative(2.04f, 2.04f, 0.0f, false, false, 2.912f, 0.0f)
                lineToRelative(0.485f, -0.39f)
                lineToRelative(0.485f, 0.39f)
                arcToRelative(2.04f, 2.04f, 0.0f, false, false, 2.912f, 0.0f)
                arcToRelative(2.104f, 2.104f, 0.0f, false, false, 0.0f, -2.95f)
                lineToRelative(-3.397f, -3.44f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 12.0f)
                lineToRelative(3.44f, -3.397f)
                arcToRelative(2.104f, 2.104f, 0.0f, false, true, 2.95f, 0.0f)
                arcToRelative(2.04f, 2.04f, 0.0f, false, true, 0.0f, 2.912f)
                lineToRelative(-0.39f, 0.485f)
                lineToRelative(0.39f, 0.485f)
                arcToRelative(2.04f, 2.04f, 0.0f, false, true, 0.0f, 2.912f)
                arcToRelative(2.104f, 2.104f, 0.0f, false, true, -2.95f, 0.0f)
                lineToRelative(-3.44f, -3.397f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 12.0f)
                lineToRelative(-3.44f, -3.397f)
                arcToRelative(2.104f, 2.104f, 0.0f, false, false, -2.95f, 0.0f)
                arcToRelative(2.04f, 2.04f, 0.0f, false, false, 0.0f, 2.912f)
                lineToRelative(0.39f, 0.485f)
                lineToRelative(-0.39f, 0.485f)
                arcToRelative(2.04f, 2.04f, 0.0f, false, false, 0.0f, 2.912f)
                arcToRelative(2.104f, 2.104f, 0.0f, false, false, 2.95f, 0.0f)
                lineToRelative(3.44f, -3.397f)
                close()
            }
        }
        .build()
        return _clover!!
    }

private var _clover: ImageVector? = null
