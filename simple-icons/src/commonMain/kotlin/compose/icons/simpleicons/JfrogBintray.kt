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

public val SimpleIcons.JfrogBintray: VectorAsset
    get() {
        if (_jfrogBintray != null) {
            return _jfrogBintray!!
        }
        _jfrogBintray = VectorAssetBuilder(name = "JfrogBintray", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.617f, 22.316f)
                horizontalLineToRelative(18.766f)
                lineTo(21.383f, 24.0f)
                lineTo(2.617f, 24.0f)
                close()
                moveTo(18.497f, 9.684f)
                lineToRelative(-5.655f, 5.655f)
                lineTo(12.842f, 3.249f)
                lineToRelative(1.744f, 1.743f)
                lineTo(15.79f, 3.79f)
                lineTo(12.0f, 0.0f)
                lineTo(8.21f, 3.79f)
                lineToRelative(1.204f, 1.203f)
                lineToRelative(1.744f, -1.804f)
                verticalLineToRelative(12.15f)
                lineTo(5.504f, 9.686f)
                lineTo(7.97f, 9.686f)
                lineTo(7.97f, 8.0f)
                lineTo(2.617f, 8.0f)
                verticalLineToRelative(5.354f)
                lineTo(4.3f, 13.354f)
                verticalLineToRelative(-2.527f)
                lineTo(12.0f, 18.526f)
                lineToRelative(7.698f, -7.699f)
                verticalLineToRelative(2.527f)
                horizontalLineToRelative(1.685f)
                lineTo(21.383f, 8.0f)
                lineTo(16.03f, 8.0f)
                verticalLineToRelative(1.684f)
                close()
            }
        }
        .build()
        return _jfrogBintray!!
    }

private var _jfrogBintray: VectorAsset? = null
