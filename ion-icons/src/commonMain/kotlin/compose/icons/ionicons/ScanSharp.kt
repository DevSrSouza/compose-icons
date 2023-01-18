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

public val IonIcons.ScanSharp: ImageVector
    get() {
        if (_scanSharp != null) {
            return _scanSharp!!
        }
        _scanSharp = Builder(name = "ScanSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(388.0f, 466.0f)
                horizontalLineTo(320.0f)
                verticalLineTo(422.0f)
                horizontalLineToRelative(68.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, 34.0f, -34.0f)
                verticalLineTo(320.0f)
                horizontalLineToRelative(44.0f)
                verticalLineToRelative(68.0f)
                arcTo(78.09f, 78.09f, 0.0f, false, true, 388.0f, 466.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(466.0f, 192.0f)
                horizontalLineTo(422.0f)
                verticalLineTo(124.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, -34.0f, -34.0f)
                horizontalLineTo(320.0f)
                verticalLineTo(46.0f)
                horizontalLineToRelative(68.0f)
                arcToRelative(78.09f, 78.09f, 0.0f, false, true, 78.0f, 78.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 466.0f)
                horizontalLineTo(124.0f)
                arcToRelative(78.09f, 78.09f, 0.0f, false, true, -78.0f, -78.0f)
                verticalLineTo(320.0f)
                horizontalLineTo(90.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, 34.0f, 34.0f)
                horizontalLineToRelative(68.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(90.0f, 192.0f)
                horizontalLineTo(46.0f)
                verticalLineTo(124.0f)
                arcToRelative(78.09f, 78.09f, 0.0f, false, true, 78.0f, -78.0f)
                horizontalLineToRelative(68.0f)
                verticalLineTo(90.0f)
                horizontalLineTo(124.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, -34.0f, 34.0f)
                close()
            }
        }
        .build()
        return _scanSharp!!
    }

private var _scanSharp: ImageVector? = null
