package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.DuplicateSharp: ImageVector
    get() {
        if (_duplicateSharp != null) {
            return _duplicateSharp!!
        }
        _duplicateSharp = Builder(name = "DuplicateSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 80.0f)
                horizontalLineTo(400.0f)
                verticalLineTo(56.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, -24.0f)
                horizontalLineTo(66.0f)
                arcTo(34.0f, 34.0f, 0.0f, false, false, 32.0f, 66.0f)
                verticalLineTo(376.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineTo(80.0f)
                verticalLineTo(112.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 112.0f, 80.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(456.0f, 112.0f)
                horizontalLineTo(136.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, 24.0f)
                verticalLineTo(456.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineTo(456.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, -24.0f)
                verticalLineTo(136.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 456.0f, 112.0f)
                close()
                moveTo(392.0f, 312.0f)
                horizontalLineTo(312.0f)
                verticalLineToRelative(80.0f)
                horizontalLineTo(280.0f)
                verticalLineTo(312.0f)
                horizontalLineTo(200.0f)
                verticalLineTo(280.0f)
                horizontalLineToRelative(80.0f)
                verticalLineTo(200.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(80.0f)
                horizontalLineToRelative(80.0f)
                close()
            }
        }
        .build()
        return _duplicateSharp!!
    }

private var _duplicateSharp: ImageVector? = null
