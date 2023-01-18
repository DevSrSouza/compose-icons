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

public val IonIcons.DocumentTextSharp: ImageVector
    get() {
        if (_documentTextSharp != null) {
            return _documentTextSharp!!
        }
        _documentTextSharp = Builder(name = "DocumentTextSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(272.0f, 41.69f)
                verticalLineTo(188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineTo(422.31f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.42f, -3.41f)
                lineTo(275.41f, 40.27f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 272.0f, 41.69f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(240.0f, 32.0f)
                lineTo(92.0f, 32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 80.0f, 44.0f)
                lineTo(80.0f, 468.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(420.0f, 480.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(432.0f, 224.0f)
                close()
                moveTo(352.0f, 384.0f)
                lineTo(160.0f, 384.0f)
                lineTo(160.0f, 352.0f)
                lineTo(352.0f, 352.0f)
                close()
                moveTo(352.0f, 304.0f)
                lineTo(160.0f, 304.0f)
                lineTo(160.0f, 272.0f)
                lineTo(352.0f, 272.0f)
                close()
            }
        }
        .build()
        return _documentTextSharp!!
    }

private var _documentTextSharp: ImageVector? = null
