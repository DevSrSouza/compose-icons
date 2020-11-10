package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Asciidoctor: VectorAsset
    get() {
        if (_asciidoctor != null) {
            return _asciidoctor!!
        }
        _asciidoctor = VectorAssetBuilder(name = "Asciidoctor", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.07f, 0.0f)
                lineTo(5.93f, 0.0f)
                arcTo(5.94f, 5.94f, 0.0f, false, false, 0.0f, 5.93f)
                lineTo(0.0f, 18.07f)
                arcTo(5.94f, 5.94f, 0.0f, false, false, 5.93f, 24.0f)
                lineTo(18.07f, 24.0f)
                arcTo(5.94f, 5.94f, 0.0f, false, false, 24.0f, 18.07f)
                lineTo(24.0f, 5.93f)
                arcTo(5.94f, 5.94f, 0.0f, false, false, 18.07f, 0.0f)
                close()
                moveTo(10.71f, 15.4f)
                lineTo(8.81f, 15.4f)
                verticalLineToRelative(0.0f)
                lineTo(7.2f, 19.28f)
                horizontalLineToRelative(0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.66f, 0.27f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, true, -0.27f, -0.67f)
                lineTo(7.72f, 15.4f)
                lineTo(4.85f, 15.4f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.51f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, true, 0.52f, -0.5f)
                horizontalLineToRelative(5.86f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.49f, 0.52f)
                arcTo(0.49f, 0.49f, 0.0f, false, true, 10.71f, 15.4f)
                close()
                moveTo(18.63f, 19.57f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, true, -0.66f, -0.29f)
                lineToRelative(-5.35f, -13.0f)
                lineTo(10.23f, 12.0f)
                lineTo(11.8f, 12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.49f, 0.52f)
                arcToRelative(0.49f, 0.49f, 0.0f, false, true, -0.51f, 0.49f)
                lineTo(5.92f, 13.01f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.51f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, true, 0.52f, -0.5f)
                horizontalLineToRelative(3.2f)
                lineToRelative(3.0f, -7.27f)
                arcToRelative(0.49f, 0.49f, 0.0f, false, true, 0.45f, -0.31f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, true, 0.48f, 0.31f)
                lineTo(18.91f, 18.9f)
                horizontalLineToRelative(0.0f)
                arcTo(0.51f, 0.51f, 0.0f, false, true, 18.63f, 19.57f)
                close()
            }
        }
        .build()
        return _asciidoctor!!
    }

private var _asciidoctor: VectorAsset? = null
