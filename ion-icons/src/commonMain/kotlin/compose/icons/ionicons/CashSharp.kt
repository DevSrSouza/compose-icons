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

public val IonIcons.CashSharp: ImageVector
    get() {
        if (_cashSharp != null) {
            return _cashSharp!!
        }
        _cashSharp = Builder(name = "CashSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 368.0f)
                horizontalLineToRelative(416.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(-416.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 416.0f)
                horizontalLineToRelative(352.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(-352.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 176.0f)
                arcToRelative(96.11f, 96.11f, 0.0f, false, true, -96.0f, -96.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(128.0f)
                verticalLineTo(80.0f)
                arcToRelative(96.11f, 96.11f, 0.0f, false, true, -96.0f, 96.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(64.0f)
                horizontalLineTo(32.0f)
                arcToRelative(96.11f, 96.11f, 0.0f, false, true, 96.0f, 96.0f)
                verticalLineToRelative(16.0f)
                horizontalLineTo(384.0f)
                verticalLineTo(336.0f)
                arcToRelative(96.11f, 96.11f, 0.0f, false, true, 96.0f, -96.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(176.0f)
                close()
                moveTo(256.0f, 304.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, 96.0f, -96.0f)
                arcTo(96.11f, 96.11f, 0.0f, false, true, 256.0f, 304.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 80.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(80.0f)
                horizontalLineTo(32.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, false, 96.0f, 80.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 272.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(80.0f)
                horizontalLineTo(96.0f)
                verticalLineTo(336.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, false, 32.0f, 272.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 144.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(416.0f)
                verticalLineTo(80.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, false, 480.0f, 144.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 336.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(80.0f)
                verticalLineTo(272.0f)
                horizontalLineTo(480.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, false, 416.0f, 336.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 208.0f)
                moveToRelative(-64.0f, 0.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 128.0f, 0.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, -128.0f, 0.0f)
            }
        }
        .build()
        return _cashSharp!!
    }

private var _cashSharp: ImageVector? = null
