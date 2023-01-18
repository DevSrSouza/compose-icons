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

public val IonIcons.NewspaperSharp: ImageVector
    get() {
        if (_newspaperSharp != null) {
            return _newspaperSharp!!
        }
        _newspaperSharp = Builder(name = "NewspaperSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(468.0f, 112.0f)
                horizontalLineTo(416.0f)
                verticalLineTo(416.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                verticalLineTo(124.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 468.0f, 112.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(431.15f, 477.75f)
                arcTo(64.11f, 64.11f, 0.0f, false, true, 384.0f, 416.0f)
                lineTo(384.0f, 44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(44.0f, 32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 32.0f, 44.0f)
                lineTo(32.0f, 424.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 56.0f, 56.0f)
                lineTo(430.85f, 480.0f)
                arcToRelative(1.14f, 1.14f, 0.0f, false, false, 0.3f, -2.25f)
                close()
                moveTo(96.0f, 208.0f)
                lineTo(96.0f, 112.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(96.0f)
                close()
                moveTo(320.0f, 400.0f)
                lineTo(96.0f, 400.0f)
                lineTo(96.0f, 368.0f)
                lineTo(320.0f, 368.0f)
                close()
                moveTo(320.0f, 336.0f)
                lineTo(96.0f, 336.0f)
                lineTo(96.0f, 304.0f)
                lineTo(320.0f, 304.0f)
                close()
                moveTo(320.0f, 272.0f)
                lineTo(96.0f, 272.0f)
                lineTo(96.0f, 240.0f)
                lineTo(320.0f, 240.0f)
                close()
                moveTo(320.0f, 208.0f)
                lineTo(224.0f, 208.0f)
                lineTo(224.0f, 176.0f)
                horizontalLineToRelative(96.0f)
                close()
                moveTo(320.0f, 144.0f)
                lineTo(224.0f, 144.0f)
                lineTo(224.0f, 112.0f)
                horizontalLineToRelative(96.0f)
                close()
            }
        }
        .build()
        return _newspaperSharp!!
    }

private var _newspaperSharp: ImageVector? = null
