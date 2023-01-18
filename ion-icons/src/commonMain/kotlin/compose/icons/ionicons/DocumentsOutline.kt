package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.DocumentsOutline: ImageVector
    get() {
        if (_documentsOutline != null) {
            return _documentsOutline!!
        }
        _documentsOutline = Builder(name = "DocumentsOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(336.0f, 264.13f)
                verticalLineTo(436.0f)
                curveToRelative(0.0f, 24.3f, -19.05f, 44.0f, -42.95f, 44.0f)
                horizontalLineTo(107.0f)
                curveTo(83.05f, 480.0f, 64.0f, 460.3f, 64.0f, 436.0f)
                verticalLineTo(172.0f)
                arcToRelative(44.26f, 44.26f, 0.0f, false, true, 44.0f, -44.0f)
                horizontalLineToRelative(94.12f)
                arcToRelative(24.55f, 24.55f, 0.0f, false, true, 17.49f, 7.36f)
                lineToRelative(109.15f, 111.0f)
                arcTo(25.4f, 25.4f, 0.0f, false, true, 336.0f, 264.13f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(200.0f, 128.0f)
                verticalLineTo(236.0f)
                arcToRelative(28.34f, 28.34f, 0.0f, false, false, 28.0f, 28.0f)
                horizontalLineTo(336.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(176.0f, 128.0f)
                verticalLineTo(76.0f)
                arcToRelative(44.26f, 44.26f, 0.0f, false, true, 44.0f, -44.0f)
                horizontalLineToRelative(94.0f)
                arcToRelative(24.83f, 24.83f, 0.0f, false, true, 17.61f, 7.36f)
                lineToRelative(109.15f, 111.0f)
                arcTo(25.09f, 25.09f, 0.0f, false, true, 448.0f, 168.0f)
                verticalLineTo(340.0f)
                curveToRelative(0.0f, 24.3f, -19.05f, 44.0f, -42.95f, 44.0f)
                horizontalLineTo(344.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(312.0f, 32.0f)
                verticalLineTo(140.0f)
                arcToRelative(28.34f, 28.34f, 0.0f, false, false, 28.0f, 28.0f)
                horizontalLineTo(448.0f)
            }
        }
        .build()
        return _documentsOutline!!
    }

private var _documentsOutline: ImageVector? = null
